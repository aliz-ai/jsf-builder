package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.JsfNamingContainerModel;

public class JsfNamingContainer extends JsfBaseComponent<JsfNamingContainer, JsfNamingContainerModel> {

	public JsfNamingContainer(String id) {
		super(id, new JsfNamingContainerModel());
	}
	
}
