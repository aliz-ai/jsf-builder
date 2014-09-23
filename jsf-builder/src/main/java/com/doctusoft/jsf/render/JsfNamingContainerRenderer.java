package com.doctusoft.jsf.render;

import com.doctusoft.jsf.comp.model.JsfNamingContainerModel;
import com.sun.faces.facelets.tag.jsf.CompositeComponentImpl;

public class JsfNamingContainerRenderer extends JsfBaseComponentRenderer<CompositeComponentImpl> {

	public JsfNamingContainerRenderer(JsfNamingContainerModel model) {
		super(CompositeComponentImpl.COMPONENT_TYPE, model);
	}
}
