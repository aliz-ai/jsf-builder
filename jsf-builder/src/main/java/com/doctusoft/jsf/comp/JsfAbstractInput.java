package com.doctusoft.jsf.comp;

import javax.faces.convert.Converter;
import javax.faces.validator.Validator;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfInputModel;

public abstract class JsfAbstractInput<Actual extends JsfAbstractInput, Value, Model extends JsfInputModel<Value>> extends
		JsfAbstractOutput<Actual, Value, Model> {
	
	public JsfAbstractInput(String id, Model model) {
		super(id, model);
	}
	
	public Actual immediate() {
		model.setImmediate(true);
		return (Actual) this;
	}
	
	public Actual withImmediate(boolean immediate) {
		model.setImmediate(immediate);
		return (Actual) this;
	}

	public Actual withDisabled(boolean value) {
		model.setDisabled(new ConstantValueBinding<Boolean>(value));
		return (Actual)this;
	}

	public Actual disabled(ValueBinding<Boolean> binding) {
		model.setDisabled(binding);
		return (Actual)this;
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
	
	public Actual addValidator(Validator validator) {
		model.getValidators().add(validator);
		return (Actual) this;
	}
	
	public Actual clearValidators() {
		model.getValidators().clear();
		return (Actual) this; 
	}
	
	public Actual setConverter(Converter converter) {
		model.setConverter(converter);
		return (Actual) this;
	}
}
