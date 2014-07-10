package com.doctusoft.jsf.binding;

import javax.el.ELContext;
import javax.el.ValueExpression;
import javax.faces.context.FacesContext;

import com.doctusoft.bean.binding.ValueBinding;

public class ValueExpressionWrapper implements ValueBinding<String> {
	
	private String name;
	
	public ValueExpressionWrapper(String name) {
		this.name = name;
	}
	
	private static ELContext getELContext() {
		return FacesContext.getCurrentInstance().getELContext();
	}
	
	private ValueExpression getValueExpression() {
		ValueExpression rootExpression = FacesContext.getCurrentInstance().getApplication().getExpressionFactory()
			.createValueExpression(getELContext(), "#{" + name + "}", String.class);
		return rootExpression;
	}
	
	@Override
	public String getValue() {
		return (String) getValueExpression().getValue(getELContext());
	}
	
	@Override
	public void setValue(String value) {
		getValueExpression().setValue(getELContext(), value);
	}
	
}
