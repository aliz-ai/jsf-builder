package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.JsfCheckboxModel;

public class JsfCheckbox extends JsfAbstractInput<JsfCheckbox, Boolean, JsfCheckboxModel>
{

	public JsfCheckbox() {
		super(new JsfCheckboxModel());
	}

}
