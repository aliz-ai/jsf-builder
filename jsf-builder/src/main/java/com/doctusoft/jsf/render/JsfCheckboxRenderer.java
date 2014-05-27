package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlSelectBooleanCheckbox;

import com.doctusoft.jsf.comp.model.JsfCheckboxModel;

public class JsfCheckboxRenderer extends JsfInputRenderer<HtmlSelectBooleanCheckbox, JsfCheckboxModel, Boolean> {

	public JsfCheckboxRenderer(JsfCheckboxModel model) {
		super(HtmlSelectBooleanCheckbox.COMPONENT_TYPE, model, Boolean.class);
	}
}
