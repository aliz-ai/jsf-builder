
package com.doctusoft.jsf.comp;

import com.doctusoft.bean.binding.ConstantValueBinding;
import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfMessageModel;

public class JsfMessage extends JsfBaseComponent<JsfMessage, JsfMessageModel> {
	
	public JsfMessage( String id ) {
		super( id, new JsfMessageModel() );
	}
	
	public JsfMessage forElement( ValueBinding<String> binding ) {
		model.setForElement( binding );
		return this;
	}
	
	public JsfMessage withForElement( String value ) {
		return forElement( new ConstantValueBinding<String>( value ) );
	}
}
