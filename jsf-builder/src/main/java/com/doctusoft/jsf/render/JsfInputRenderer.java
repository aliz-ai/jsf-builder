package com.doctusoft.jsf.render;

import javax.faces.component.UIInput;
import javax.faces.validator.Validator;

import com.doctusoft.jsf.comp.model.JsfInputModel;

public class JsfInputRenderer<Component extends UIInput, Model extends JsfInputModel<Value>, Value> extends JsfOutputRenderer<Component, Model, Value> {

	public JsfInputRenderer(String componentType, Model model, Class<Value> valueClass) {
		super(componentType, model, valueClass);
		bind("required", model.getRequired(), Boolean.class);
		bind("requiredMessage", model.getRequiredMessage());
		bind("readonly", model.getReadonly(), Boolean.class);
		component.setImmediate(model.isImmediate());
		for (Validator validator : model.getValidators()) {
			component.addValidator(validator);
		}
	}

}