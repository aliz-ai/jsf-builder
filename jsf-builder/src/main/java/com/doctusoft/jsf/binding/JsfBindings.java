package com.doctusoft.jsf.binding;

import com.doctusoft.bean.binding.Bindings;
import com.doctusoft.bean.binding.ValueBindingBuilder;

public class JsfBindings {
	
	private static final ClassNameNamingConvention convention = new ClassNameNamingConvention();
	
	/**
	 * Starts a binding from a top-level backing bean named with the {@link ClassNameNamingConvention}.
	 * For LoginBacking.class, it practically returns #{LoginBacking}
	 */
	public static <T> ValueBindingBuilder<T> on(Class<T> backingClass) {
		return Bindings.from(new ELRootBinding(convention.getBeanName(backingClass), backingClass));
	}
	
	/**
	 * Starts a binding from the given top-level backing bean name, with the given type.
	 * Use this method for cases when no standard {@link BackingNamingConvention}s can be applied. 
	 */
	public static <T> ValueBindingBuilder<T> on(Class<T> backingClass, String name) {
		return Bindings.from(new ELRootBinding(name, backingClass));
	}

}
