package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.JsfCustomElementModel;

public class JsfCustomElement extends JsfBaseComponent<JsfCustomElement, JsfCustomElementModel> {
	
	public JsfCustomElement(String elementName) {
		super(null, new JsfCustomElementModel());
		model.setElementName(elementName);
	}

}
