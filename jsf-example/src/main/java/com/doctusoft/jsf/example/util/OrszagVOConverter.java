package com.doctusoft.jsf.example.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import com.doctusoft.jsf.example.model.OrszagVO;

public class OrszagVOConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		for (OrszagVO orszag : OrszagVO.orszagok()) {
			if (orszag.getAzonosito().equals(value))
				return orszag;
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value == null)
			return null;
		OrszagVO orszag = (OrszagVO) value;
		return orszag.getAzonosito();
	}

}
