package com.doctusoft.jsf;

import javax.faces.component.UIComponent;

import com.doctusoft.bean.ParametricClassMethodReferences.ClassMethodReference0;
import com.doctusoft.bean.binding.EmptyEventHandler;
import com.doctusoft.bean.binding.ValueBindingBuilder;
import com.doctusoft.jsf.binding.ELRootBinding;
import com.doctusoft.jsf.binding.JsfBindings;
import com.doctusoft.jsf.comp.JsfPanelGroup;


public class AbstractBackingView<Backing> {
	
	private Class<Backing> backingClass;
	private String backingName;
	
	protected JsfPanelGroup container;
	
	public AbstractBackingView(Class<Backing> backingClass, String backingName, String id) {
		this.backingClass = backingClass;
		this.backingName = backingName;
		container = new JsfPanelGroup(id);
	}
	
	public UIComponent getComponent() {
		return RendererFactory.get().getRenderer(container.getModel()).getComponent();
	}
	
	public Backing resolveBacking() {
		return ELRootBinding.resolve(backingClass, backingName);
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
	
	public UIComponent getInstance() {
		return getComponent(); 
	}
	
	public void setInstance(UIComponent instance) {
		// do nothing;
	}
}
