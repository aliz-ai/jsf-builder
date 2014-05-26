package com.doctusoft.jsf.render;

import javax.faces.component.UIOutput;

import com.doctusoft.jsf.comp.model.JsfOutputModel;

public class JsfOutputRenderer<Component extends UIOutput, Model extends JsfOutputModel<Value>, Value> extends JsfBaseComponentRenderer<Component> {
	
	public JsfOutputRenderer(Component component, Model model, Class<Value> valueClass) {
		super(component, model);
		bind("value", model.getValue(), valueClass);
		component.setConverter(model.getConverter());
	}

}
