package com.doctusoft.jsf.binding;

import javax.el.ELContext;
import javax.el.ValueExpression;

import com.doctusoft.bean.binding.ValueBinding;

public class BindingWrapper<T> extends ValueExpression {
	
	private Class<T> type;
	private ValueBinding<T> binding;

	public BindingWrapper(ValueBinding<T> binding, Class<T> type) {
		this.binding = binding;
		this.type = type;
	}

	@Override
	public Class<?> getExpectedType() {
		return type;
	}

	@Override
	public Class<?> getType(ELContext arg0) {
		return type;
	}

	@Override
	public Object getValue(ELContext arg0) {
		return binding.getValue();
	}

	@Override
	public boolean isReadOnly(ELContext arg0) {
		return false;
	}

	@Override
	public void setValue(ELContext arg0, Object value) {
		binding.setValue((T) value);
	}

	@Override
	public boolean equals(Object arg0) {
		return false;
	}

	@Override
	public String getExpressionString() {
		return null;
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean isLiteralText() {
		return false;
	}

}
