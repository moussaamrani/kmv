package be.unamur.coreal.typing

import be.unamur.coreal.coreAL.Class
import be.unamur.coreal.coreAL.Type
import be.unamur.coreal.lib.CoreALLib
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider

import static be.unamur.coreal.typing.CoreALTypeProvider.*

import static extension be.unamur.coreal.util.CoreALModelUtil.*
import be.unamur.coreal.coreAL.Enumeration

class CoreALTypeConformance {
	@Inject extension IQualifiedNameProvider

	def isConformant(Type c1, Type c2) {
		switch (c1) {
			Enumeration:
				return c1 == c2
			Class:
				switch (c2) {
					Enumeration:
						false
					Class:
						return c1 == nullType || // null can be assigned to everything
							(conformToLibraryTypes(c1, c2)) || 
							c1 == c2 ||
							c2.fullyQualifiedName.toString == CoreALLib::LIB_OBJECT || 
							c1.isSubclassOf(c2)
					default: false
				}
			default: false
		}
	}

	def conformToLibraryTypes(Class c1, Class c2) {
		(c1.conformsToString && c2.conformsToString) || 
		(c1.conformsToInt && c2.conformsToInt)       ||
		(c1.conformsToBoolean && c2.conformsToBoolean)
	}

	def conformsToString(Class c) {
		c == stringType || 
		c.fullyQualifiedName.toString == CoreALLib::LIB_STRING
	}

	def conformsToInt(Class c) {
		c == integerType || 
		c.fullyQualifiedName.toString == CoreALLib::LIB_INTEGER
	}

	def conformsToBoolean(Class c) {
		c == booleanType || 
		c.fullyQualifiedName.toString == CoreALLib::LIB_BOOLEAN
	}

	def isSubclassOf(Class c1, Class c2) {
		c1.classHierarchy.contains(c2)
	}
}