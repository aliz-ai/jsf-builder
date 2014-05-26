package com.doctusoft.jsf.comp.model;

import javax.faces.convert.Converter;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.bean.binding.ValueBinding;

@Getter @Setter
public abstract class JsfOutputModel<Value> extends JsfBaseComponentModel {
	private ValueBinding<Value> value;
	private Converter converter;

}
