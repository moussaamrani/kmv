package be.unamur.coreal.scoping

import com.google.inject.Inject

import be.unamur.coreal.coreAL.CoreALPackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider

class CoreALIndex {
	@Inject ResourceDescriptionsProvider rdp
	@Inject IContainer.Manager cm

	def getVisibleEObjectDescriptions(EObject o) {
		o.getVisibleContainers.map[ container |
			container.getExportedObjects
		].flatten
	}

	def getVisibleEObjectDescriptions(EObject o, EClass type) {
		o.getVisibleContainers.map[ container |
			container.getExportedObjectsByType(type)
		].flatten
	}

	def getVisibleClassesDescriptions(EObject o) {
		o.getVisibleEObjectDescriptions(CoreALPackage::eINSTANCE.class_)
	}

	def getVisibleContainers(EObject o) {
		val index = rdp.getResourceDescriptions(o.eResource)
		val rd = index.getResourceDescription(o.eResource.URI)
		if (rd != null)
			cm.getVisibleContainers(rd, index)
		else
			emptyList
	}

	def getResourceDescription(EObject o) {
		val index = rdp.getResourceDescriptions(o.eResource)
		index.getResourceDescription(o.eResource.URI)
	}

	def getExportedEObjectDescriptions(EObject o) {
		o.getResourceDescription.getExportedObjects
	}
}