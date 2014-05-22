package com.doctusoft.jsf;

import javax.faces.component.html.HtmlCommandButton;

import com.doctusoft.jsf.comp.model.JsfButtonModel;

public class JsfButtonRenderer extends JsfBaseRenderer<HtmlCommandButton> {
	
	public JsfButtonRenderer(JsfButtonModel model) {
		super(new HtmlCommandButton(), model);
		bind("value", model.getCaption());
		bindCommand(model.getAction());
	}

}
