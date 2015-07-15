package be.unamur.xtext.scoping

import org.eclipse.emf.ecore.EReference
//import be.unamur.xtext.coreAl.Reference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import be.unamur.xtext.utils.CoreAlModelUtils

class CoreAlScopeProvider {
	def scope_opposite(be.unamur.xtext.coreAl.Reference context, EReference ref){
		val type = context.getType.getType
		switch(type){
			be.unamur.xtext.coreAl.Class 		: return Scopes::scopeFor(CoreAlModelUtils.references(type), IScope::NULLSCOPE)
		}
	}
}