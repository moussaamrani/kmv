package be.unamur.coreal.generator

import be.unamur.coreal.coreAL.BooleanType
import be.unamur.coreal.coreAL.Class
import be.unamur.coreal.coreAL.CollectionType
import be.unamur.coreal.coreAL.EnumLiteral
import be.unamur.coreal.coreAL.Enumeration
import be.unamur.coreal.coreAL.Feature
import be.unamur.coreal.coreAL.IntegerType
import be.unamur.coreal.coreAL.Local
import be.unamur.coreal.coreAL.Metamodel
import be.unamur.coreal.coreAL.RealType
import be.unamur.coreal.coreAL.ReturnType
import be.unamur.coreal.coreAL.StringType
import be.unamur.coreal.coreAL.TypeReference
import be.unamur.coreal.coreAL.VoidType
import be.unamur.coreal.typing.CoreALTypeProvider
import com.google.inject.Inject


import static extension be.unamur.coreal.util.CoreALModelUtil.*
import static be.unamur.coreal.generator.MaudeConstants.*

class MaudeNameProvider {
	@Inject extension CoreALTypeProvider

	def dispatch CharSequence getMaudeName(Metamodel MM) {
		return MM.name
	}


	def dispatch CharSequence getMaudeName(Class c){
		return c.name + NAME_SEP + c.containingMetamodel.maudeName
	}
	def dispatch CharSequence getMaudeName(Enumeration e){
		return e.name + NAME_SEP + e.containingMetamodel.maudeName
	}

	def dispatch CharSequence getMaudeName(Feature feature) {
		return feature.name + NAME_SEP + feature.containingClass.maudeName
	}

	def dispatch CharSequence getMaudeName(EnumLiteral literal) {
		return literal.name + NAME_SEP + literal.containingEnumeration.maudeName
	}

	def dispatch CharSequence getMaudeName(Local local) {
		return local.name + NAME_SEP + local.containingOperation.maudeName
	}

	def dispatch CharSequence getMaudeName(TypeReference type) {
		if(type.ref != null){
			return type.ref.name + NAME_SEP + type.containingMetamodel.maudeName
		}else if(type.kind != null){
			switch(type.kind){
				BooleanType: return NAME_SEP + "Bool"
				IntegerType: return NAME_SEP + "Int"
				RealType   : return NAME_SEP + "Real"
				StringType : return NAME_SEP + "String"
			}			
		}
	}
	
	def dispatch CharSequence getMaudeName(ReturnType rtype){
		switch(rtype){
			VoidType : return "nil"
			CollectionType : return rtype.type.maudeName
		}
	}
}