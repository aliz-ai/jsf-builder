package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfInputModel;

public abstract class JsfAbstractInput<Actual extends JsfAbstractInput, Value, Model extends JsfInputModel<Value>> extends
		JsfBaseComponent<Actual, Model> {
	
	public JsfAbstractInput(String id, Model model) {
		super(id, model);
	}

	public Actual bind(ValueBinding<Value> binding) {
		model.setValue(binding);
		return (Actual) this;
	}

	public Actual withValue(Value value) {
		model.setValue(new ConstantValueBinding<Value>(value));
		return (Actual) this;
	}
	
	public Actual withReadonly(boolean value) {
		model.setReadonly(new ConstantValueBinding<Boolean>(value));
		return (Actual) this;
	}

	public Actual readonly(ValueBinding<Boolean> binding) {
		model.setReadonly(binding);
		return (Actual) this;
	}

	public Actual withRequired(boolean value) {
		model.setRequired(new ConstantValueBinding<Boolean>(value));
		return (Actual) this;
	}

	public Actual required(ValueBinding<Boolean> binding) {
		model.setRequired(binding);
		return (Actual) this;
	}

	public Actual withRequiredMessage(String value) {
		model.setRequiredMessage(new ConstantValueBinding<String>(value));
		return (Actual) this;
	}

	public Actual requiredMessage(ValueBinding<String> value) {
		model.setRequiredMessage(value);
		return (Actual) this;
	}

}
