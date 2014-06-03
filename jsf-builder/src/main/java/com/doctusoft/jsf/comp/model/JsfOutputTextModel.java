package com.doctusoft.jsf.comp.model;

import com.doctusoft.bean.binding.ValueBinding;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class JsfOutputTextModel extends JsfOutputModel<String> {
	private ValueBinding<Boolean> escape;
}
