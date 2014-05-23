package com.doctusoft.jsf.example;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.Property;

@Getter @Setter
public class PersonListItem {
	
	@Property
	private String name;
	
	public PersonListItem(String name) {
		this.name = name;
	}
	
	@Property
	private boolean viewMode = true;

	@Property(readonly=true)
	public boolean isEditMode() {
		return !viewMode;
	}

}
