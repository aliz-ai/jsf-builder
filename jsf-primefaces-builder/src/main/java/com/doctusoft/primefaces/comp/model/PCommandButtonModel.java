package com.doctusoft.primefaces.comp.model;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.jsf.comp.model.JsfButtonModel;

@Getter @Setter
public class PCommandButtonModel extends JsfButtonModel {
	
	private PAjaxActionModel ajaxActionModel = new PAjaxActionModel();
}
