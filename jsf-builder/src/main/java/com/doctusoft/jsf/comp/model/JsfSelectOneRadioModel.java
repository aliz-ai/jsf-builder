package com.doctusoft.jsf.comp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import com.doctusoft.bean.binding.ValueBinding;

@Getter @Setter
public class JsfSelectOneRadioModel extends JsfSelectModel {
	
	@AllArgsConstructor @Getter
	public enum Layout {
		LineDirection("lineDirection"),
		PageDirection("pageDirection");
		
		private String description;
	}
	
	private ValueBinding<String> layout;
}
