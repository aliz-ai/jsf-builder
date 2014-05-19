package com.doctusoft.jsf.binding;

import javax.el.ELContext;
import javax.el.ValueExpression;
import javax.faces.context.FacesContext;

import com.doctusoft.bean.binding.ValueBinding;

public class ELRootBinding<T> implements ValueBinding<T> {
	
	private String name;
	private Class<T> type;

	public ELRootBinding(String name, Class<T> type) {
		this.name = name;
		this.type = type;
	}
	
	protected static ELContext getELContext() {
		return FacesContext.getCurrentInstance().getELContext();
	}
	
	public static <T> T resolve(Class<T> type, String name) {
		ELContext context = getELContext();
		ValueExpression rootExpression = FacesContext.getCurrentInstance().getApplication().getExpressionFactory()
		        .createValueExpression(context, "#{" + name + "}", type);
		T value = (T) rootExpression.getValue(context);
		return value;
	}
	
	@Override
	public T getValue() {
		return resolve(type, name);
	}
	
	@Override
	public void setValue(T value) {
		throw new UnsupportedOperationException("Root EL bindings cannot be set: " + name);
	}

}
