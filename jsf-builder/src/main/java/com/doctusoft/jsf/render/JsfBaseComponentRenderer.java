package com.doctusoft.jsf.render;

import javax.faces.component.UICommand;
import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;
import javax.faces.component.behavior.AjaxBehavior;
import javax.faces.component.behavior.ClientBehaviorHolder;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

import com.doctusoft.bean.binding.EmptyEventHandler;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.AbstractRendererFactory;
import com.doctusoft.jsf.RendererFactory;
import com.doctusoft.jsf.binding.BindingWrapper;
import com.doctusoft.jsf.comp.model.JsfAjaxBehaviorModel;
import com.doctusoft.jsf.comp.model.JsfBaseComponentModel;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.sun.faces.facelets.tag.jsf.core.AjaxHandler;
import com.sun.faces.renderkit.RenderKitUtils;

public class JsfBaseComponentRenderer<Component extends UIComponent> implements Renderer {
	
	private JsfBaseComponentModel model;
	protected Component component;

	public JsfBaseComponentRenderer(String componentType, JsfBaseComponentModel model) {
		this((Component) FacesContext.getCurrentInstance().getApplication().createComponent(componentType), model);
	}

	@Deprecated
	public JsfBaseComponentRenderer(Component component, JsfBaseComponentModel model) {
		this.component = component;
		this.model = model;
		component.setId(model.getId());
		bind("onclick", model.getOnclick());
		bind("onkeydown", model.getOnkeydown());
		bind("onkeypress", model.getOnkeypress());
		bind("onkeyup", model.getOnkeyup());
		bind("rendered", model.getRendered(), Boolean.class);
		bind("disabled", model.getDisabled(), Boolean.class);
		bind("style", model.getStyle());
		bind("styleClass", model.getStyleClass());
		// render children
		AbstractRendererFactory jsfRendererFactory = RendererFactory.get();
		if (model.getChildren() != null) {
			for (JsfBaseComponentModel child : model.getChildren()) {
				 component.getChildren().add(jsfRendererFactory.getRenderer(child).getComponent());
			}
		}
		// handle ajax behaviour
		if (model.getAjaxModels() != null) {
			installAjaxResourceIfNecessary();
			for (JsfAjaxBehaviorModel behaviorModel : model.getAjaxModels()) {
				AjaxBehavior ajaxBehavior = new AjaxBehavior();
				ClientBehaviorHolder clientBehaviorHolder = (ClientBehaviorHolder) component;
				String eventName = behaviorModel.getEvent();
				if (eventName == null) {
					eventName = clientBehaviorHolder.getDefaultEventName();
				}
				ajaxBehavior.setExecute(Objects.firstNonNull(behaviorModel.getExecute(), ImmutableList.of("@form")));
				ajaxBehavior.setRender(Objects.firstNonNull(behaviorModel.getRender(), ImmutableList.of("@form")));
				clientBehaviorHolder.addClientBehavior(eventName, ajaxBehavior);
				
			}
		}
	}

	@Override
	public UIComponent getComponent() {
		return component;
	}
	
	protected <T> void bind(String property, ValueBinding<T> binding, Class<T> type) {
		if (binding != null) {
			component.setValueExpression(property, new BindingWrapper<T>(binding, type));
		}
	}

	/**
	 * Binds String values
	 */
	protected <T> void bind(String property, ValueBinding<String> binding) {
		if (binding != null) {
			component.setValueExpression(property, new BindingWrapper<String>(binding, String.class));
		}
	}
	
	public void bindCommand(final EmptyEventHandler handler) {
		if (handler == null)
			return;
		((UICommand) component).addActionListener(new ActionListener() {
			@Override
			public void processAction(ActionEvent event)
					throws AbortProcessingException {
				handler.handle();
			}
		});
	}
	
    /**
     *  Copy-pasted from {@link AjaxHandler}
     */
    private void installAjaxResourceIfNecessary() {

        FacesContext context = FacesContext.getCurrentInstance();
        if (RenderKitUtils.hasScriptBeenRendered(context)) {
            // Already included, return
            return;
        }

        final String name = "jsf.js";
        final String library = "javax.faces";

        if (RenderKitUtils.hasResourceBeenInstalled(context, name, library)) {
            RenderKitUtils.setScriptAsRendered(context);
            return;
        }
        UIOutput output = new UIOutput();
        output.setRendererType("javax.faces.resource.Script");
        output.getAttributes().put("name", name);
        output.getAttributes().put("library", library);
        context.getViewRoot().addComponentResource(context, output, "head");

        // Set the context to record script as included
        RenderKitUtils.setScriptAsRendered(context);

    }

}
