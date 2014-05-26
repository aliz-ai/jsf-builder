package com.doctusoft.jsf.comp.model;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.bean.binding.ValueBinding;

@Getter @Setter
public class JsfLabelModel extends JsfOutputModel<String> {
	
	private ValueBinding<String> label;

}
