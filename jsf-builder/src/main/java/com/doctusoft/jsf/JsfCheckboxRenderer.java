package com.doctusoft.jsf;

import javax.faces.component.html.HtmlSelectBooleanCheckbox;

import com.doctusoft.jsf.comp.model.JsfCheckboxModel;

public class JsfCheckboxRenderer extends JsfUIInputRenderer<HtmlSelectBooleanCheckbox, JsfCheckboxModel, Boolean> {

	public JsfCheckboxRenderer(JsfCheckboxModel model) {
		super(new HtmlSelectBooleanCheckbox(), model, Boolean.class);
	}
}
