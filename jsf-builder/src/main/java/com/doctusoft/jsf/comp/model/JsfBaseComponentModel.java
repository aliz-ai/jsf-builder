package com.doctusoft.jsf.comp.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.bean.binding.ValueBinding;

@Getter @Setter
public class JsfBaseComponentModel implements HasComponentModel {
	
	private JsfBaseComponentModel parent;
	
	private String id;
	
	/**
	 * If the view is already embedded in one or many NamingContainers, set this value to ":nc1:nc2[...]" to make id resolution work properly 
	 */
	private String rootIdChain;
	
	private ValueBinding<String> onclick;
	
	private ValueBinding<String> onkeydown;
	
	private ValueBinding<String> onkeypress;
	
	private ValueBinding<String> onkeyup;
	
	private ValueBinding<Boolean> rendered;
	
	private ValueBinding<String> style;
	
	private ValueBinding<String> styleClass;

	private ValueBinding<Boolean> disabled;
	
	private List<JsfBaseComponentModel> children = null;
	
	private List<JsfAjaxBehaviorModel> ajaxModels = null;

	@Override
	public JsfBaseComponentModel getModel() {
		return this;
	}

	public String getQualifiedId() {
		String idPart = "";
		if (parent != null) {
			idPart = parent.getQualifiedId();
		} else if (rootIdChain != null) {
			idPart = rootIdChain;
		}
		idPart += ":" + id;
		return idPart;
	}
	

}
