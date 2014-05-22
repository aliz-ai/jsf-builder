package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlPanelGroup;

import com.doctusoft.jsf.comp.model.JsfPanelGroupModel;

public class JsfPanelGroupRenderer extends JsfBaseRenderer<HtmlPanelGroup> {
	
	public JsfPanelGroupRenderer(JsfPanelGroupModel model) {
		super(new HtmlPanelGroup(), model);
	}

}
