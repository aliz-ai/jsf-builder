package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfInputTextModel;

public class JsfInputText extends JsfBaseComponent<JsfInputText, JsfInputTextModel> {

	public JsfInputText() {
		super(new JsfInputTextModel());
	}
	
	public JsfInputText bind(ValueBinding<String> binding) {
		model.setValue(binding);
		return this;
	}

	public JsfInputText withValue(String value) {
		model.setValue(new ConstantValueBinding<String>(value));
		return this;
	}
	
	public JsfInputText withReadonly(boolean value) {
		model.setReadonly(new ConstantValueBinding<Boolean>(value));
		return this;
	}

	public JsfInputText withReadonly(ValueBinding<Boolean> binding) {
		model.setReadonly(binding);
		return this;
	}

	public JsfInputText withRequired(boolean value) {
		model.setRequired(new ConstantValueBinding<Boolean>(value));
		return this;
	}

	public JsfInputText withRequired(ValueBinding<Boolean> binding) {
		model.setRequired(binding);
		return this;
	}

	public JsfInputText withRequiredMessage(String value) {
		model.setRequiredMessage(new ConstantValueBinding<String>(value));
		return this;
	}

	public JsfInputText withRequiredMessage(ValueBinding<String> value) {
		model.setRequiredMessage(value);
		return this;
	}

	public JsfInputText withMaxLength(int value) {
		model.setMaxLength(new ConstantValueBinding<Integer>(value));
		return this;
	}

	public JsfInputText withMaxLength(ValueBinding<Integer> binding) {
		model.setMaxLength(binding);
		return this;
	}

}
