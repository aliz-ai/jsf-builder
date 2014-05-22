package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlPanelGroup;

import com.doctusoft.jsf.comp.model.JsfBaseComponentModel;
import com.doctusoft.jsf.comp.model.JsfContainerModel;

public class JsfContainerRenderer extends JsfBaseRenderer<HtmlPanelGroup> {
	
	public JsfContainerRenderer(JsfContainerModel model) {
		super(new HtmlPanelGroup(), model);
		// TODO resolve a renderfactory instance in a customizable way
		JsfRendererFactory jsfRendererFactory = new JsfRendererFactory();
		for (JsfBaseComponentModel child : model.getChildren()) {
			 component.getChildren().add(jsfRendererFactory.getRenderer(child).getComponent());
		}
	}

}
