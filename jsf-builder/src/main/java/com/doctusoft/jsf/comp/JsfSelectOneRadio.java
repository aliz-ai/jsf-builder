package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfSelectOneRadioModel;

public class JsfSelectOneRadio<Value> extends JsfSelectOne<Value, JsfSelectOneRadio<Value>, JsfSelectOneRadioModel> {

	public JsfSelectOneRadio(String id) {
		super(id, new JsfSelectOneRadioModel());
	}
	
	public JsfSelectOneRadio<Value> withLayout(String value) {
		model.setLayout(new ConstantValueBinding<String>(value));
		return this;
	}

	public JsfSelectOneRadio<Value> layout(ValueBinding<String> binding) {
		model.setLayout(binding);
		return this;
	}
}
