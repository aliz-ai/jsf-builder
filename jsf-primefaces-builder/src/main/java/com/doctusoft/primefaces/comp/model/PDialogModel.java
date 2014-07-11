package com.doctusoft.primefaces.comp.model;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfBaseComponentModel;

@Getter @Setter
public class PDialogModel extends JsfBaseComponentModel {

	private ValueBinding<String> header;
	private ValueBinding<String> widgetVar;
	private ValueBinding<Boolean> modal;
	private ValueBinding<String> width;
	private ValueBinding<String> height;
	private ValueBinding<Boolean> resizable;
}
