package com.doctusoft.jsf.comp.model;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.bean.binding.ValueBinding;
import com.google.common.collect.Maps;

@Getter @Setter
public class JsfCustomElementModel extends JsfBaseComponentModel {
	
	private String elementName;
	
	private Map<String, String> attributes = Maps.newHashMap();
	private Map<String, ValueBinding<?>> attributesWithBinding = Maps.newHashMap();

	}
