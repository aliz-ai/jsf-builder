package com.doctusoft.jsf.custom;

import java.io.IOException;
import java.util.Map;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.bean.binding.ValueBinding;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;

@Getter
@Setter
@FacesComponent(value = CustomElementComponent.COMPONENT_TYPE)
public class CustomElementComponent extends UIComponentBase {
	
	public static final String COMPONENT_TYPE = "com.doctusoft.jsf-builder.CustomElement";
	
	private String id;
	private String styleClass;
	private String style;
	private String text;
	private String elementName;
	private Map<String, String> additionalAttributes = Maps.newHashMap();
	private Map<String, ValueBinding<?>> additionalAttributesWithBinding = Maps.newHashMap();
	
	public CustomElementComponent() {
		super();
	}
	
	protected void append(final FacesContext context, final String appendValue) throws IOException {
		context.getResponseWriter().append(appendValue);
	}

	@Override
	public void encodeBegin(final FacesContext context) throws IOException {
		StringBuilder builder = new StringBuilder();
		builder.append("<" + elementName);
		
		if (!Strings.isNullOrEmpty(id)) {
			builder.append(" id=\"" + id + "\"");
		}
		
		if (!Strings.isNullOrEmpty(styleClass)) {
			builder.append(" class=\"" + styleClass + "\"");
		}
		
		if (!Strings.isNullOrEmpty(style)) {
			builder.append(" style=\"" + style + "\"");
		}
		
		for (String name : getAdditionalAttributes().keySet()) {
			builder.append(" " + name + "=\"" + getAdditionalAttributes().get(name) + "\"");
		}
			
		for (String name : getAdditionalAttributesWithBinding().keySet()) {
			builder.append(" " + name + "=\"" +  getAdditionalAttributesWithBinding().get(name).getValue()  + "\"");
		}
		
		builder.append(">");
		
		if (!Strings.isNullOrEmpty(text)) {
			builder.append(text);
		}
		
		append(context, builder.toString());
	}
	
	@Override
	public void encodeEnd(final FacesContext context) throws IOException {
		append(context, "</" + elementName + ">");
	}
	
	@Override
	public String getFamily() {
		return elementName;
	}
	
}
