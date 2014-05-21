package com.doctusoft.jsf;

import javax.faces.component.UICommand;
import javax.faces.component.UIComponent;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

import com.doctusoft.bean.binding.EmptyEventHandler;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.binding.BindingWrapper;
import com.doctusoft.jsf.comp.model.JsfBaseComponentModel;
import com.doctusoft.jsf.render.Renderer;

public class BaseJsfRenderer<Component extends UIComponent> implements Renderer {
	
	private JsfBaseComponentModel model;
	protected Component component;

	public BaseJsfRenderer(Component component, JsfBaseComponentModel model) {
		this.component = component;
		this.model = model;
		bind("onclick", model.getOnclick());
		bind("onkeydown", model.getOnkeydown());
		bind("onkeypress", model.getOnkeypress());
		bind("onkeyup", model.getOnkeyup());
		bind("rendered", model.getRendered(), Boolean.class);
		bind("disabled", model.getDisabled(), Boolean.class);
	}

	@Override
	public UIComponent getComponent() {
		return component;
	}
	
	protected <T> void bind(String property, ValueBinding<T> binding, Class<T> type) {
		component.setValueExpression(property, new BindingWrapper<T>(binding, type));
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
}
