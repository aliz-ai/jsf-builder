package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.HasComponentModel;
import com.doctusoft.jsf.comp.model.JsfBaseComponentModel;

public abstract class JsfBaseComponent<Actual, Model extends JsfBaseComponentModel> implements HasComponentModel {
	
	protected Model model;
	
	public JsfBaseComponent(Model model) {
		this.model = model;
	}

	public Model getModel() {
		return model;
	}
	
	public Actual appendTo(IsContainer<?> container) {
		container.add(this);
		return (Actual) this;
	}
}
