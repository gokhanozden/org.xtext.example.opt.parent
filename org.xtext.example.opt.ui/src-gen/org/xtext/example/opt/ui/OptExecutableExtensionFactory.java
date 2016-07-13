/*
 * generated by Xtext 2.9.2
 */
package org.xtext.example.opt.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.opt.ui.internal.OptActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class OptExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return OptActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return OptActivator.getInstance().getInjector(OptActivator.ORG_XTEXT_EXAMPLE_OPT_OPT);
	}
	
}