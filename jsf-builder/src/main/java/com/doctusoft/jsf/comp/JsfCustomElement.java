package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.JsfCustomElementModel;

public class JsfCustomElement extends JsfBaseComponent<JsfCustomElement, JsfCustomElementModel> {
	
	public JsfCustomElement(String elementName, String id) {
		super(id, new JsfCustomElementModel());
		model.setElementName(elementName);
	}

	public JsfCustomElement(String elementName) {
		this(elementName, null);
	}

}
