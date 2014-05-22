package com.doctusoft.jsf.comp.model;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.bean.binding.ValueBinding;

@Getter @Setter
public class JsfInputModel<Value> extends JsfBaseComponentModel {

	private ValueBinding<Value> value;
	private ValueBinding<Boolean> required;
	private ValueBinding<String> requiredMessage;
	private ValueBinding<Boolean> readonly;
	
}