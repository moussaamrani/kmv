/*
 * generated by Xtext
 */
package be.unamur.coreal;

import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import be.unamur.coreal.scoping.CoreALImportedNamespaceAwareLocalScopeProvider;
import be.unamur.coreal.scoping.CoreALResourceDescriptionsStrategy;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class CoreALRuntimeModule extends be.unamur.coreal.AbstractCoreALRuntimeModule {
//	@Override
//	public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
//		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class)
//				.annotatedWith(
//						com.google.inject.name.Names
//								.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
//				.to(CoreALImportedNamespaceAwareLocalScopeProvider.class);
//	}
	
	/*
	 * If you enable this strategy, the NamesAreUniqueValidator will not
	 * work as expected.
	 */
	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return CoreALResourceDescriptionsStrategy.class;
	}

}
