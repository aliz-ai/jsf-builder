package com.doctusoft.jsf.example;

import com.doctusoft.jsf.AbstractBackingView;
import com.doctusoft.primefaces.comp.PCommandButton;

public class PrimeTestView extends AbstractBackingView<PrimeTestBacking> {
	
	public PrimeTestView() {
		super(PrimeTestBacking.class, "PrimeTestBacking", "primetest");
		new PCommandButton("testButton", "Test").appendTo(container);
	}

}
