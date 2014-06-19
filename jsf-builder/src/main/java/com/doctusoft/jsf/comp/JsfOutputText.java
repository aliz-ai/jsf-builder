package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfOutputTextModel;

public class JsfOutputText extends JsfAbstractOutput<JsfOutputText, String, JsfOutputTextModel> { 

	public JsfOutputText(String id) {
		super(id, new JsfOutputTextModel());
	}
	
	public JsfOutputText escape(ValueBinding<Boolean> binding) {
		model.setEscape(binding);
		return this;
	}

	public JsfOutputText withEscape(boolean value) {
		return escape(new ConstantValueBinding<Boolean>(value));
	}
	
	
}
