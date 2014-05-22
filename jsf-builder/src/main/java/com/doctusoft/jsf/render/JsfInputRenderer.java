package com.doctusoft.jsf.render;

import javax.faces.component.UIInput;

import com.doctusoft.jsf.comp.model.JsfInputModel;

public class JsfInputRenderer<Component extends UIInput, Model extends JsfInputModel<Value>, Value> extends JsfBaseRenderer<Component> {

	public JsfInputRenderer(Component component, Model model, Class<Value> valueClass) {
		super(component, model);
		bind("value", model.getValue(), valueClass);
		bind("required", model.getRequired(), Boolean.class);
		bind("requiredMessage", model.getRequiredMessage());
		bind("readonly", model.getReadonly(), Boolean.class);
	}

}