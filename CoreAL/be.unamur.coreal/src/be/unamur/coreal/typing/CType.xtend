package be.unamur.coreal.typing

import be.unamur.coreal.coreAL.Bag
import be.unamur.coreal.coreAL.BooleanType
import be.unamur.coreal.coreAL.Class
import be.unamur.coreal.coreAL.CollectionType
import be.unamur.coreal.coreAL.Collection
import be.unamur.coreal.coreAL.CoreALFactory
import be.unamur.coreal.coreAL.IntegerType
//import be.unamur.coreal.coreAL.MultiplicityType
import be.unamur.coreal.coreAL.OrderedSet
import be.unamur.coreal.coreAL.PrimitiveType
import be.unamur.coreal.coreAL.RealType
import be.unamur.coreal.coreAL.ReturnType
import be.unamur.coreal.coreAL.Sequence
import be.unamur.coreal.coreAL.Set
import be.unamur.coreal.coreAL.StringType
import be.unamur.coreal.coreAL.Type
import be.unamur.coreal.coreAL.VoidType
import be.unamur.coreal.typing.Coll

class CType {
	public static val String  = CoreALFactory::eINSTANCE.createClass => [name = "String"]
	public static val Integer = CoreALFactory::eINSTANCE.createClass => [name = "Integer"]
	public static val Real    = CoreALFactory::eINSTANCE.createClass => [name = "Real"]
	public static val Boolean = CoreALFactory::eINSTANCE.createClass => [name = "Boolean"]
//	public static val Null    = CoreALFactory::eINSTANCE.createClass => [name = "Null"]
	public static val Void    = CoreALFactory::eINSTANCE.createClass => [name = "Void"]

	public static val NString = new CType(String)
	public static val NInteger = new CType(Integer)
	public static val NReal = new CType(Real)
	public static val NBoolean = new CType(Boolean)
//	public static val CNull = new CType(Null)
	public static val NVoid = new CType(Void)

	public static val BString = new CType(Coll.BAG, String)
	public static val BInteger = new CType(Coll.BAG, Integer)
	public static val BReal = new CType(Coll.BAG, Real)
	public static val BBoolean = new CType(Coll.BAG, Boolean)

	public static val SString = new CType(Coll.SET, String)
	public static val SInteger = new CType(Coll.SET, Integer)
	public static val SReal = new CType(Coll.SET, Real)
	public static val SBoolean = new CType(Coll.SET, Boolean)

	public static val LString = new CType(Coll.LIST, String)
	public static val LInteger = new CType(Coll.LIST, Integer)
	public static val LReal = new CType(Coll.LIST, Real)
	public static val LBoolean = new CType(Coll.LIST, Boolean)

	public static val OString = new CType(Coll.OSET, String)
	public static val OInteger = new CType(Coll.OSET, Integer)
	public static val OReal = new CType(Coll.OSET, Real)
	public static val OBoolean = new CType(Coll.OSET, Boolean)


	private Coll collection = Coll.NONE
	private Type type

	private new(Type type) {
		this(Coll.NONE, type)
	}

	private new(Coll collection, Type type){
		this.collection = collection
		this.type = type
	}


	private static def Coll toCollection(Collection collection) {
		if(collection == null)
			return Coll.NONE
		switch (collection) {
			Bag: return Coll.BAG
			OrderedSet: return Coll.OSET
			Sequence: return Coll.LIST
			Set: return Coll.SET
		}
	}

	def Type getType(){
		return this.type
	}

	def Coll getCollection(){
		return this.collection
	}

	def static operator_lessEqualsThan(Coll c1, Coll c2){
		return  (c1 == Coll.OSET && c2 != Coll.NONE) ||
				((c1 == Coll.SET || c1 == Coll.LIST) && c2 == Coll.BAG)
	}

	def String getName(){
		return this.type.name
	}

	private def static CType typeOf(Collection collection, PrimitiveType ptype) {
		val coll = toCollection(collection)
		switch(coll){
			case Coll.NONE:{
				switch(ptype){
					IntegerType: return NInteger
					BooleanType: return NBoolean
					RealType   : return NReal
					StringType : return NString
				}
			} 
			case Coll.BAG:{
				switch(ptype){
					IntegerType: return BInteger
					BooleanType: return BBoolean
					RealType   : return BReal
					StringType : return BString
				}
			} 
			case Coll.SET :{
				switch(ptype){
					IntegerType: return SInteger
					BooleanType: return SBoolean
					RealType   : return SReal
					StringType : return SString
				}
			}
			case Coll.LIST:{
				switch(ptype){
					IntegerType: return LInteger
					BooleanType: return LBoolean
					RealType   : return LReal
					StringType : return LString
				}				
			}
			case Coll.OSET:{
				switch(ptype){
					IntegerType: return OInteger
					BooleanType: return OBoolean
					RealType   : return OReal
					StringType : return OString
				}				
			}
		}
	}

	public def static CType typeOf(CollectionType ctype) {
		var CType result
		if (ctype.type.ref != null)
			result = new CType(toCollection(ctype.collection), ctype.type.ref)
		if (ctype.type.kind != null)
			result = typeOf(ctype.collection, ctype.type.kind)
		return result
	}

//	public def static CType typeOf(MultiplicityType mtype) {
//		return typeOf(mtype.ctype)
//	}
//
//	public def static CType typeOf(ReturnType rtype) {
//		switch(rtype){
//			VoidType: return CType.NVoid
//			MultiplicityType: return typeOf(rtype.ctype)
//		}
//	}
	
	public def static boolean isPrimitiveType(CType ctype){
		val internalType = ctype.type
		return (internalType instanceof Class && (internalType as Class).eResource == null)
	}

	public static def CType create(Coll collection, Type type){
		return new CType(collection, type)
	}

	public static def CType create(Type type){
		return new CType(Coll.NONE, type)
	}

	override equals(Object arg0) {
		if (!(arg0 instanceof CType))
			return false
		else {
			var CType o = arg0 as CType
			return ( o.collection == this.collection && o.type == this.type)
		}
	}

}