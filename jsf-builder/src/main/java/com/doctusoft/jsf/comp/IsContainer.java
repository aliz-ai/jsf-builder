package com.doctusoft.jsf.comp;

import com.doctusoft.jsf.comp.model.HasComponentModel;

public interface IsContainer<Actual> {
	
	public Actual add(HasComponentModel component);

}
