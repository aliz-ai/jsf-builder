package com.doctusoft.primefaces.renderer;

import org.primefaces.component.commandbutton.CommandButton;

import com.doctusoft.jsf.render.JsfButtonRenderer;
import com.doctusoft.primefaces.comp.model.PCommandButtonModel;

public class PCommandButtonRenderer extends JsfButtonRenderer {
	
	public PCommandButtonRenderer(PCommandButtonModel model) {
		super(new CommandButton(), model);
	}

}
