package com.doctusoft.jsf.example;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Getter;
import lombok.Setter;

import com.doctusoft.Property;

@SessionScoped
@ManagedBean(name="PrimeTestBacking")
@Getter @Setter
public class PrimeTestBacking {

	@Property
	private Date oneDate;
	

}
