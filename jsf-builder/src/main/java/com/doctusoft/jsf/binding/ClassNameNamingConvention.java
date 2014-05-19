package com.doctusoft.jsf.binding;


/**
 * A simple {@link BackingNamingConvention} that uses the simpleName of the class. 
 */
public class ClassNameNamingConvention implements BackingNamingConvention {
	
	@Override
	public String getBeanName(Class<?> beanClass) {
		return beanClass.getSimpleName();
	}

}
