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
		component.setValueExpression(property, new BindingWrapper<String>(binding, String.class));
	}
	
	public void bindCommand(final EmptyEventHandler handler) {
		((UICommand) component).addActionListener(new ActionListener() {
			@Override
			public void processAction(ActionEvent event)
					throws AbortProcessingException {
				handler.handle();
			}
		});
	}
}
