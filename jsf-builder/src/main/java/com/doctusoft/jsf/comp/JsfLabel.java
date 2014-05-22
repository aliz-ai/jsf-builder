package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfLabelModel;

public class JsfLabel extends JsfBaseComponent<JsfLabel, JsfLabelModel> {
	
	public JsfLabel() {
		super(new JsfLabelModel());
	}
	
	public JsfLabel(String label) {
		super(new JsfLabelModel());
		withLabel(label);
	}

	public JsfLabel bind(ValueBinding<String> binding) {
		model.setLabel(binding);
		return this;
	}

	public JsfLabel withLabel(String label) {
		model.setLabel(new ConstantValueBinding<String>(label));
		return this;
	}
}
