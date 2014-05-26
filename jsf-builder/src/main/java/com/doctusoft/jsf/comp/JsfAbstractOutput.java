package com.doctusoft.jsf.comp;

import javax.faces.convert.Converter;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfOutputModel;

public abstract class JsfAbstractOutput<Actual extends JsfAbstractOutput, Value, Model extends JsfOutputModel<Value>> extends JsfBaseComponent<Actual, Model> {

	public JsfAbstractOutput(String id, Model model) {
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
	
	public Actual withConverter(Converter value) {
		model.setConverter(value);
		return (Actual) this;
	}

}
