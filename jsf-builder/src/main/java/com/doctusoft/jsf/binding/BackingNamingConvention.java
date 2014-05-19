package com.doctusoft.jsf.binding;

/**
 * An interface to implement default naming conventions for finding out backing bean names.
 * If you application uses conventions like LoginBacking.class -> "LoginBacking", or "loginBacking", or "login",
 * you can implement this interface and you can create a static helper method that uses it.
 * 
 *  @see JsfBindings for usage examples for default convetions
 *  @see 
 */
public interface BackingNamingConvention {
	
	public String getBeanName(Class<?> beanClass);

}
