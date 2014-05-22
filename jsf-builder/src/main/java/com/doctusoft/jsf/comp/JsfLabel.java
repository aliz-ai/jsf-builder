package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfLabelModel;

public class JsfLabel extends JsfBaseComponent<JsfLabel, JsfLabelModel> {
	
	public JsfLabel(String id) {
		super(id, new JsfLabelModel());
	}
	
	public JsfLabel(String id, String label) {
		this(id);
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
