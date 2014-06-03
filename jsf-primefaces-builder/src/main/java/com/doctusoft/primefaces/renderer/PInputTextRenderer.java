package com.doctusoft.primefaces.renderer;

import org.primefaces.component.inputtext.InputText;

import com.doctusoft.jsf.render.JsfInputRenderer;
import com.doctusoft.primefaces.comp.model.PInputTextModel;

public class PInputTextRenderer extends JsfInputRenderer<InputText, PInputTextModel, String> {

	public PInputTextRenderer(PInputTextModel model) {
		super(InputText.COMPONENT_TYPE, model, String.class);
		bind("maxlength", model.getMaxLength(), Integer.class);
		bind("disabled", model.getDisabled() , Boolean.class);
	}
}
