package be.unamur.coreal.scoping

import be.unamur.coreal.coreAL.Metamodel
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor

class CoreALResourceDescriptionsStrategy extends DefaultResourceDescriptionStrategy {
	
	@Inject extension IQualifiedNameProvider
	
	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (eObject instanceof Metamodel) {
			(eObject as Metamodel).types.forEach[
				calClass |
				val fullyQualifiedName = calClass.fullyQualifiedName
				if (fullyQualifiedName != null)
					acceptor.accept(
						EObjectDescription::create(
							fullyQualifiedName, calClass
						)
					)
			]
			true
		} else
			false
	}
}