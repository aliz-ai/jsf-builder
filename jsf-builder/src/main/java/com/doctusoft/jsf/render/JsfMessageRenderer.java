
package com.doctusoft.jsf.render;

import javax.faces.component.html.HtmlMessage;

import com.doctusoft.jsf.comp.model.JsfMessageModel;

public class JsfMessageRenderer extends JsfBaseComponentRenderer<HtmlMessage> {
	
	public JsfMessageRenderer( JsfMessageModel model ) {
		super( HtmlMessage.COMPONENT_TYPE, model );
		bind( "for", model.getForElement(), String.class );
	}
	
}
