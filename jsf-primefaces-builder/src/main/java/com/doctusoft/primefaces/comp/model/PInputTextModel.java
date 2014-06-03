package com.doctusoft.primefaces.comp.model;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.bean.binding.ValueBinding;
import com.doctusoft.jsf.comp.model.JsfInputTextModel;

@Getter @Setter
public class PInputTextModel extends JsfInputTextModel {

	private ValueBinding<Boolean> disabled;

}
