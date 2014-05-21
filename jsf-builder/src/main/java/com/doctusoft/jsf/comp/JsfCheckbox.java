package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfCheckboxModel;

public class JsfCheckbox extends JsfBaseComponent<JsfCheckbox, JsfCheckboxModel>
//extends JsfUIInputComponent<JsfCheckbox, Boolean> 
{

	public JsfCheckbox() {
		super(new JsfCheckboxModel());
	}

	public JsfCheckbox bind(ValueBinding<Boolean> binding) {
		model.setValue(binding);
		return this;
	}

	public JsfCheckbox withValue(boolean value) {
		model.setValue(new ConstantValueBinding<Boolean>(value));
		return this;
	}
	
	public JsfCheckbox withReadonly(boolean value) {
		model.setReadonly(new ConstantValueBinding<Boolean>(value));
		return this;
	}

	public JsfCheckbox withReadonly(ValueBinding<Boolean> binding) {
		model.setReadonly(binding);
		return this;
	}

	public JsfCheckbox withRequired(boolean value) {
		model.setRequired(new ConstantValueBinding<Boolean>(value));
		return this;
	}

	public JsfCheckbox withRequired(ValueBinding<Boolean> binding) {
		model.setRequired(binding);
		return this;
	}

	public JsfCheckbox withRequiredMessage(String value) {
		model.setRequiredMessage(new ConstantValueBinding<String>(value));
		return this;
	}

	public JsfCheckbox withRequiredMessage(ValueBinding<String> value) {
		model.setRequiredMessage(value);
		return this;
	}

//	@Override
//	public JsfCheckbox get() {
//		return this;
//	}
	
}
