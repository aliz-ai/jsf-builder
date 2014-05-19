package com.doctusoft.jsf.comp.model;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.bean.binding.EmptyEventHandler;
import com.doctusoft.bean.binding.ValueBinding;

@Getter @Setter
public class JsfButtonModel extends JsfBaseComponentModel {
	
	private ValueBinding<String> caption;
	
	private EmptyEventHandler action;

}
