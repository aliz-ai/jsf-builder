package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfTextareaModel;

public class JsfTextarea extends JsfBaseComponent<JsfTextarea, JsfTextareaModel> {

	public JsfTextarea() {
		super(new JsfTextareaModel());
	}
	
	public JsfTextarea bind(ValueBinding<String> binding) {
		model.setValue(binding);
		return this;
	}

	public JsfTextarea withValue(String value) {
		model.setValue(new ConstantValueBinding<String>(value));
		return this;
	}

	public JsfTextarea withRows(int value) {
		model.setRows(new ConstantValueBinding<Integer>(value));
		return this;
	}

	public JsfTextarea withReadonly(boolean value) {
		model.setReadonly(new ConstantValueBinding<Boolean>(value));
		return this;
	}

	public JsfTextarea withReadonly(ValueBinding<Boolean> binding) {
		model.setReadonly(binding);
		return this;
	}

	public JsfTextarea withRequired(boolean value) {
		model.setRequired(new ConstantValueBinding<Boolean>(value));
		return this;
	}

	public JsfTextarea withRequired(ValueBinding<Boolean> binding) {
		model.setRequired(binding);
		return this;
	}

	public JsfTextarea withRequiredMessage(String value) {
		model.setRequiredMessage(new ConstantValueBinding<String>(value));
		return this;
	}

	public JsfTextarea withRequiredMessage(ValueBinding<String> value) {
		model.setRequiredMessage(value);
		return this;
	}

}
