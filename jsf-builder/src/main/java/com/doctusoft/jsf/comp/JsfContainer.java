package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.HasComponentModel;
import com.doctusoft.jsf.comp.model.JsfContainerModel;

public class JsfContainer extends JsfBaseComponent<JsfContainer, JsfContainerModel> implements IsContainer<JsfContainer> {
	
	public JsfContainer() {
		super(new JsfContainerModel());
	}
	
	public JsfContainer add(HasComponentModel component) {
		model.getChildren().add(component.getModel());
		return this;
	}

}
