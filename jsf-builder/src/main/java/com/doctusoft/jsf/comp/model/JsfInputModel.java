package com.doctusoft.jsf.comp.model;

import java.util.List;

import javax.faces.validator.Validator;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.bean.binding.ValueBinding;
import com.google.common.collect.Lists;

@Getter @Setter
public abstract class JsfInputModel<Value> extends JsfOutputModel<Value> {

	private ValueBinding<Boolean> required;
	private ValueBinding<String> requiredMessage;
	private ValueBinding<Boolean> readonly;
	private boolean immediate = false;
	private List<Validator> validators = Lists.newArrayList();
	
}