package be.unamur.coreal.generator

import be.unamur.coreal.coreAL.Statement
import java.util.Iterator
import java.util.Map.Entry
import java.util.Set
import java.util.NoSuchElementException

public class OperationBodyIterator implements Iterator<Entry<Integer, Statement>> {
	private Integer current = 1
	private Integer size = 0
	private Set<Entry<Integer, Statement>> entries
//	private OperationBodyNumberer obn
	
	public new(OperationBodyNumberer obn){
		if(obn == null)
			throw new IllegalArgumentException("OperatorBodyIterator constructed with null argument")
		this.entries = obn.rank.entrySet
		this.size = obn.rank.size
	}

	override hasNext() {
		return ( current <= this.size)
	}

	override next() {
		if(!hasNext)
			throw new NoSuchElementException()
		val result = entries.findFirst[e|e.key == current]
		current = current +1
		return result
	}
	
	override remove() {
        throw new UnsupportedOperationException("Not supported.");
    }
}
