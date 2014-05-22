package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfInputTextModel;

public class JsfInputText extends JsfAbstractInput<JsfInputText, String, JsfInputTextModel> {

	public JsfInputText() {
		super(new JsfInputTextModel());
	}
	
	public JsfInputText withMaxLength(int value) {
		model.setMaxLength(new ConstantValueBinding<Integer>(value));
		return this;
	}

	public JsfInputText maxLength(ValueBinding<Integer> binding) {
		model.setMaxLength(binding);
		return this;
	}

}
