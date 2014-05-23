package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.JsfCustomContentModel;

public class JsfCustomContent extends JsfBaseComponent<JsfCustomContent, JsfCustomContentModel> {
	
	public JsfCustomContent(String content) {
		super(null, new JsfCustomContentModel());
		model.setContent(content);
	}

}
