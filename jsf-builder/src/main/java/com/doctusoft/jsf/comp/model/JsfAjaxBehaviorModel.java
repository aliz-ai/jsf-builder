package com.doctusoft.jsf.comp.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class JsfAjaxBehaviorModel {
	
	private String event;
	
	private List<JsfAjaxTarget> execute;
	
	private List<JsfAjaxTarget> render;

}
