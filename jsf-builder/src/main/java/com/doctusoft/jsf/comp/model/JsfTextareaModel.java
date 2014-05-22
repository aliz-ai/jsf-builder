package com.doctusoft.jsf.comp.model;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.bean.binding.ValueBinding;

@Getter @Setter
public class JsfTextareaModel extends JsfInputModel<String> {

	private ValueBinding<Integer> rows;
	private ValueBinding<Integer> cols;

}
