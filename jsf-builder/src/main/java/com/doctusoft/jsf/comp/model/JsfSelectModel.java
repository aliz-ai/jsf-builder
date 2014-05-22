package com.doctusoft.jsf.comp.model;

import java.util.List;

import javax.faces.model.SelectItem;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class JsfSelectModel extends JsfInputModel<String> {

	private List<SelectItem> selectItems;
}
