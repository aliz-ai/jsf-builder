package com.doctusoft.jsf.comp.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.bean.binding.ValueBinding;

@Getter @Setter
public class JsfRepeatModel extends JsfBaseComponentModel {
	
	private String var;
	
	private String varStatus;
	
	private ValueBinding<List<?>> items;

}
