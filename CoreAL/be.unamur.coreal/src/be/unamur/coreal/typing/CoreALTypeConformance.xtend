package be.unamur.coreal.typing

import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import be.unamur.coreal.coreAL.Class
import be.unamur.coreal.lib.CoreALLib

import static extension be.unamur.coreal.typing.CoreALTypeProvider.*
import static extension be.unamur.coreal.util.CoreALModelUtil.*

class CoreALTypeConformance {
		@Inject extension IQualifiedNameProvider
	
	def isConformant(Class c1, Class c2) {
		c1 == nullType || // null can be assigned to everything
		(conformToLibraryTypes(c1, c2)) ||
		c1 == c2 ||
		c2.fullyQualifiedName.toString == CoreALLib::LIB_OBJECT ||
		c1.isSubclassOf(c2)
	}

	def conformToLibraryTypes(Class c1, Class c2) {
		(c1.conformsToString && c2.conformsToString) ||
		(c1.conformsToInt && c2.conformsToInt) ||
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