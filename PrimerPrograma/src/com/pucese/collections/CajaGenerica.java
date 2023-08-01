package com.pucese.collections;

public class CajaGenerica <T> {
	private T dato;
	
	public CajaGenerica() {
		
	}

	public T quita() {
		return dato;
	}

	public void poner(T dato) {
		this.dato = dato;
	}
	

}
