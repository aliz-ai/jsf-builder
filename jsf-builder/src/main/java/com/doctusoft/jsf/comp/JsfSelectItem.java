package com.doctusoft.jsf.comp;

import javax.faces.model.SelectItem;

import lombok.Getter;
import lombok.Setter;

/**
 * Don't confuse this with the standard {@link SelectItem}. The problem with that one is that
 * it represents the value of the option as a string in the html output. It's reasonable of course,
 * but you must rely on mere converters to provide conversion between your business object and its string
 * representation. These custom builders provde an easier way to make your business objects selectable. 
 */
@Getter @Setter
public class JsfSelectItem<T>  {
	
	private T value;
	
	private String id;
	
	private String label;
}
