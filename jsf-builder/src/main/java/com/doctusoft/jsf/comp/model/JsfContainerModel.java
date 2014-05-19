package com.doctusoft.jsf.comp.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.google.common.collect.Lists;

@Getter @Setter
public class JsfContainerModel extends JsfBaseComponentModel {
	
	private List<JsfBaseComponentModel> children = Lists.newArrayList();

}
