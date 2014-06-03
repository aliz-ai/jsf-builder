package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfOutputTextModel;

public class JsfOutputText extends JsfBaseComponent<JsfOutputText, JsfOutputTextModel> {

	public JsfOutputText(String id) {
		super(id, new JsfOutputTextModel());
	}
	
	public JsfOutputText bind(ValueBinding<String> binding) {
		model.setValue(binding);
		return this;
	}

	public JsfOutputText withValue(String value) {
		model.setValue(new ConstantValueBinding<String>(value));
		return this;
	}

	public JsfOutputText escape(ValueBinding<Boolean> binding) {
		model.setEscape(binding);
		return this;
	}

	public JsfOutputText withEscape(boolean value) {
		return escape(new ConstantValueBinding<Boolean>(value));
	}
	
	
}
