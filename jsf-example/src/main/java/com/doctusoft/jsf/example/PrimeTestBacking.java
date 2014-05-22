package com.doctusoft.jsf.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlPanelGroup;

import lombok.Getter;
import lombok.Setter;

@SessionScoped
@ManagedBean(name="PrimeTestBacking")
@Getter @Setter
public class PrimeTestBacking {

	private HtmlPanelGroup view = null;

	public HtmlPanelGroup getView() {
		if (view == null) {
			view = (HtmlPanelGroup) new PrimeTestView().getComponent();
		}
		return view;
	}
	
	public void setView(HtmlPanelGroup view) {
		// do nothing
	}


}
