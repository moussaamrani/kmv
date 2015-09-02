package be.unamur.coreal.scoping

import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

class CoreALImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
		override getImplicitImports(boolean ignoreCase) {
		newArrayList(new ImportNormalizer(
			QualifiedName::create("coreal", "lang"), true, ignoreCase
		))
	}
}