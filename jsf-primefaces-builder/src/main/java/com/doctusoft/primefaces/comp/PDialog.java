package com.doctusoft.primefaces.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.JsfBaseComponent;
import com.doctusoft.primefaces.comp.model.PDialogModel;

public class PDialog extends JsfBaseComponent<PDialog, PDialogModel> {

	public PDialog(String id) {
		super(id, new PDialogModel());
	}
	
	public PDialog width(int width) {
		model.setWidth(new ConstantValueBinding<String>(Integer.toString(width)));
		return this;
	}

	public PDialog height(int height) {
		model.setHeight(new ConstantValueBinding<String>(Integer.toString(height)));
		return this;
	}

	public PDialog modal() {
		model.setModal(new ConstantValueBinding<Boolean>(true));
		return this;
	}

	public PDialog header(ValueBinding<String> header) {
		model.setHeader(header);
		return this;
	}

	public PDialog header(String header) {
		model.setHeader(new ConstantValueBinding<String>(header));
		return this;
	}
	
	public PDialog widgetVar(String widgetVar) {
		model.setWidgetVar(new ConstantValueBinding<String>(widgetVar));
		return this;
	}
	
	public PDialog resizable(boolean resizable) {
		model.setResizable(new ConstantValueBinding<Boolean>(resizable));
		return this;
	}
}
