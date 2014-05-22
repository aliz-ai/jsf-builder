package com.doctusoft.jsf;

import javax.faces.component.UIComponent;

import com.doctusoft.bean.ParametricClassMethodReferences.ClassMethodReference0;
import com.doctusoft.bean.binding.EmptyEventHandler;
import com.doctusoft.bean.binding.ValueBindingBuilder;
import com.doctusoft.jsf.binding.ELRootBinding;
import com.doctusoft.jsf.binding.JsfBindings;
import com.doctusoft.jsf.comp.JsfPanelGroup;
import com.doctusoft.jsf.render.JsfPanelGroupRenderer;


public class AbstractBackingView<Backing> {
	
	private Class<Backing> backingClass;
	private String backingName;
	
	protected JsfPanelGroup container = new JsfPanelGroup();

	public AbstractBackingView(Class<Backing> backingClass, String backingName) {
		this.backingClass = backingClass;
		this.backingName = backingName;
	}
	
	public UIComponent getComponent() {
		// TODO: resolve customized rendererfactory for the case the developer wants to customize container rendering
		return new JsfPanelGroupRenderer(container.getModel()).getComponent();
	}
	
	protected ValueBindingBuilder<Backing> bindOnPresenter() {
		return JsfBindings.on(backingClass, backingName);
	}

	protected EmptyEventHandler presenterMethod(final ClassMethodReference0<Backing, Void> methodRef) {
		return new EmptyEventHandler() {
			@Override
			public void handle() {
				methodRef.apply(ELRootBinding.resolve(backingClass, backingName));
			}
		};
	}
}
