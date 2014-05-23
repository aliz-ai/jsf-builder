package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.JsfPanelGroupModel;

public class JsfPanelGroup extends JsfBaseComponent<JsfPanelGroup, JsfPanelGroupModel> implements IsContainer<JsfPanelGroup> {
	
	public JsfPanelGroup(String id) {
		super(id, new JsfPanelGroupModel());
	}
	
}
