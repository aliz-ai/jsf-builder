package com.doctusoft.primefaces.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import com.google.common.base.Strings;

@FacesConverter(value = "calendarDefaultConverter" )
public class CalendarDefaultConverter implements Converter {

	private static final DateFormat df = new SimpleDateFormat("yyyy.MM.dd.", new Locale("hu"));
	
	/* (non-Javadoc)
	 * @see javax.faces.convert.Converter#getAsObject(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.String)
	 */
	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		Date date = null;
        // Prevent ParseException when an empty form field is submitted
        // for conversion
        if (Strings.isNullOrEmpty(value)) {
            date = null;
        } else {
            try {
            	df.setLenient(false);
                date = df.parse(value);
            } catch (ParseException e) {
            	final FacesMessage facesMessage = new FacesMessage("Nem létező dátum, vagy nem megfelelő dátumformátum!");
        		throw new ConverterException(facesMessage);
            }
        }
        return date;
        
	}

	/* (non-Javadoc)
	 * @see javax.faces.convert.Converter#getAsString(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.Object)
	 */
	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		if (value == null) {
            return null;
        } else if (!(value instanceof Date)) {
            throw new IllegalArgumentException(
                "objectValue is not a Date object");
        } else {
        	df.setLenient(false);
            return df.format(value);
        }
	}

}
