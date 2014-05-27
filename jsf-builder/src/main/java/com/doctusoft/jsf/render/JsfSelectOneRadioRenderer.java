package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlSelectOneRadio;

import com.doctusoft.jsf.comp.model.JsfSelectOneRadioModel;

public class JsfSelectOneRadioRenderer extends JsfSelectOneRenderer<HtmlSelectOneRadio, JsfSelectOneRadioModel> {

	public JsfSelectOneRadioRenderer(JsfSelectOneRadioModel model) {
		super(HtmlSelectOneRadio.COMPONENT_TYPE, model);
	}

}
