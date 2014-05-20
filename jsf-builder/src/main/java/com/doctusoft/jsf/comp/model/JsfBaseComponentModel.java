package com.doctusoft.jsf.comp.model;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.bean.binding.ValueBinding;

@Getter @Setter
public class JsfBaseComponentModel implements HasComponentModel {
	
	private ValueBinding<String> onclick;
	
	private ValueBinding<String> onkeydown;
	
	private ValueBinding<String> onkeypress;
	
	private ValueBinding<String> onkeyup;
	
	private ValueBinding<Boolean> rendered;
	
	private ValueBinding<String> style;
	
	private ValueBinding<String> styleClass;
	
	@Override
	public JsfBaseComponentModel getModel() {
		return this;
	}
	
}
