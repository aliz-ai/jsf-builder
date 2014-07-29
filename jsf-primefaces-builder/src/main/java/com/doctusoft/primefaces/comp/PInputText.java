package com.doctusoft.primefaces.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.JsfAbstractInput;
import com.doctusoft.primefaces.comp.model.PInputTextModel;

public class PInputText extends JsfAbstractInput<PInputText, String, PInputTextModel> {

	public PInputText(String id) {
		super(id, new PInputTextModel());
	}
	
	public PInputText withMaxLength(int value) {
		model.setMaxLength(new ConstantValueBinding<Integer>(value));
		return this;
	}

	public PInputText maxLength(ValueBinding<Integer> binding) {
		model.setMaxLength(binding);
		return this;
	}
}
