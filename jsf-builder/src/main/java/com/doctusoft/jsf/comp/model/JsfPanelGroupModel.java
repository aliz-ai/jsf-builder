package com.doctusoft.jsf.comp.model;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.bean.binding.ValueBinding;

@Getter @Setter
public class JsfPanelGroupModel extends JsfBaseComponentModel {
	
	private ValueBinding<Boolean> rendered;

}
