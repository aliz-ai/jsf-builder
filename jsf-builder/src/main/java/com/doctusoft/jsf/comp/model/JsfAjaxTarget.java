package com.doctusoft.jsf.comp.model;

import lombok.Getter;

/**
 * Stores either a String target id, or a reference to a commponent model. 
 */
@Getter
public class JsfAjaxTarget {
	
	private String targetId;
	
	private JsfBaseComponentModel model;
	
	public JsfAjaxTarget(String targetId) {
		this.targetId = targetId;
	}
	
	public JsfAjaxTarget(JsfBaseComponentModel model) {
		this.model = model;
	}

}
