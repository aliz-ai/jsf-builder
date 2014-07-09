package com.doctusoft.primefaces.renderer;

import org.primefaces.component.dialog.Dialog;

import com.doctusoft.jsf.render.JsfBaseComponentRenderer;
import com.doctusoft.primefaces.comp.model.PDialogModel;

public class PDialogRenderer extends JsfBaseComponentRenderer<Dialog> {

	public PDialogRenderer(PDialogModel model) {
		super(Dialog.COMPONENT_TYPE, model);
		bind("header", model.getHeader());
		bind("modal", model.getModal(), Boolean.class);
		bind("width", model.getWidth());
		bind("height", model.getHeight());
		bind("widgetVar", model.getWidgetVar());
		bind("resizable", model.getResizable(), Boolean.class);
	}

	
}
