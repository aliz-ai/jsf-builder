package com.doctusoft.primefaces.renderer;

import org.primefaces.component.commandbutton.CommandButton;

import com.doctusoft.jsf.render.JsfButtonRenderer;
import com.doctusoft.primefaces.comp.model.PAjaxActionModel;
import com.doctusoft.primefaces.comp.model.PCommandButtonModel;

public class PCommandButtonRenderer extends JsfButtonRenderer {
	
	public PCommandButtonRenderer(PCommandButtonModel model) {
		super(new CommandButton(), model);
		// rendering ajax actions cannot be reused, because these properties are not exposed on a reusable interface by primefaces
		CommandButton button = (CommandButton) component;
		PAjaxActionModel ajax = model.getAjaxActionModel();
		button.setAjax(ajax.isAjax());
		button.setProcess(ajax.getProcess());
		button.setUpdate(ajax.getUpdate());
	}

}
