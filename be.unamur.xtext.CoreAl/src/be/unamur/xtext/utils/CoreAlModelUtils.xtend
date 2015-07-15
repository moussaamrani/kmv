package be.unamur.xtext.utils

class CoreAlModelUtils {
	def static attributes(be.unamur.xtext.coreAl.Class c){
		c.features.filter(typeof(be.unamur.xtext.coreAl.Attribute))
	}
	
	def static references(be.unamur.xtext.coreAl.Class c){
		c.features.filter(typeof(be.unamur.xtext.coreAl.Reference))
	}
	
	def static opeations(be.unamur.xtext.coreAl.Class c){
		c.features.filter(typeof(be.unamur.xtext.coreAl.Operation))
	}
	
}