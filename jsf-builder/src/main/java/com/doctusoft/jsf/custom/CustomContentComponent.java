package com.doctusoft.jsf.custom;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@FacesComponent(value = "jsf-builder")
public class CustomContentComponent extends UIComponentBase {

	private String content; 
	
	@Override
	public void encodeBegin(FacesContext context) throws IOException {
		context.getResponseWriter().append(content);
	}

	@Override
	public String getFamily() {
		return "html";
	}
}
