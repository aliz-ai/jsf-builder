package com.doctusoft.jsf.comp.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class JsfFormModel extends JsfBaseComponentModel {
	
	private String entype = Enctype.UrlEncoded;
	
	public interface Enctype {
		public static String UrlEncoded = "application/x-www-form-urlencoded";
		public static String Multipart = "multipart/form-data";
	}

}
