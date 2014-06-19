package com.doctusoft.jsf.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.doctusoft.Property;

@Getter @Setter @NoArgsConstructor
public class DataHolder {
	
	@Property
	private String prop1 = "prop1";

	@Property
	private String prop2 = "prop2";
}
