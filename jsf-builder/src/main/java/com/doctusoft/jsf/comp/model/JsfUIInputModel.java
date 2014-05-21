package com.doctusoft.jsf.comp.model;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.bean.binding.ValueBinding;

@Getter @Setter
public class JsfUIInputModel<ValueType> extends JsfBaseComponentModel {

	private ValueBinding<ValueType> value;
	private ValueBinding<Boolean> required;
	private ValueBinding<String> requiredMessage;
	private ValueBinding<Boolean> readonly;
	
}