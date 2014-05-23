package com.doctusoft.jsf.render;

import com.doctusoft.jsf.comp.model.JsfCustomContentModel;
import com.doctusoft.jsf.custom.CustomContentComponent;


public class JsfCustomContentRenderer extends JsfBaseComponentRenderer<CustomContentComponent> {
	
	public JsfCustomContentRenderer(JsfCustomContentModel model) {
		super(new CustomContentComponent(), model);
		component.setContent(model.getContent());
	}

}
