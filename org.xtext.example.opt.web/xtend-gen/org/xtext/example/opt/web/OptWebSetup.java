/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.opt.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Provider;
import com.google.inject.util.Modules;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.xtext.example.opt.OptRuntimeModule;
import org.xtext.example.opt.OptStandaloneSetup;
import org.xtext.example.opt.web.OptWebModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class OptWebSetup extends OptStandaloneSetup {
  private final Provider<ExecutorService> executorServiceProvider;
  
  @Override
  public Injector createInjector() {
    final OptRuntimeModule runtimeModule = new OptRuntimeModule();
    final OptWebModule webModule = new OptWebModule(this.executorServiceProvider);
    Modules.OverriddenModuleBuilder _override = Modules.override(runtimeModule);
    Module _with = _override.with(webModule);
    return Guice.createInjector(_with);
  }
  
  public OptWebSetup(final Provider<ExecutorService> executorServiceProvider) {
    super();
    this.executorServiceProvider = executorServiceProvider;
  }
}
