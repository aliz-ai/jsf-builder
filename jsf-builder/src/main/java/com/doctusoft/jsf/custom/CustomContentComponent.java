package com.doctusoft.jsf.custom;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@FacesComponent(value = CustomContentComponent.COMPONENT_TYPE)
public class CustomContentComponent extends UIComponentBase {
	
	public static final String COMPONENT_TYPE = "com.doctusoft.jsf-builder.CustomContent";

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
