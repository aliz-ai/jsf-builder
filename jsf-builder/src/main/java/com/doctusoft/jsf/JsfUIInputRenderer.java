package com.doctusoft.jsf;

import javax.faces.component.UIInput;

import com.doctusoft.jsf.comp.model.JsfUIInputModel;

public class JsfUIInputRenderer<UIInputType extends UIInput, ModelType extends JsfUIInputModel<ValueType>, ValueType> extends BaseJsfRenderer<UIInputType> {

	public JsfUIInputRenderer(UIInputType component, ModelType model, Class<ValueType> valueClass) {
		super(component, model);
		bind("value", model.getValue(), valueClass);
		bind("required", model.getRequired(), Boolean.class);
		bind("requiredMessage", model.getRequiredMessage());
		bind("readonly", model.getReadonly(), Boolean.class);
	}

}