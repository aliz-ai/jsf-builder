package com.doctusoft.jsf.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.MethodRef;
import com.doctusoft.Property;

@SessionScoped
@ManagedBean(name="AjaxTestBacking")
@Getter @Setter
public class AjaxTestBacking {

	@Property
	private String inputValue;
	
	@Property
	private String message;
	
	@Property
	private String selectedValue;

	@MethodRef
	public void testMethod() {
		setMessage("you entered: " + inputValue);
	}
}
