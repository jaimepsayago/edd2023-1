package com.pucese.collections;

public class ClaseGenericaParametros <T, V>  {
//usar los parametros del tipo de dato
	T obj1;
	V obj2;
	
	public ClaseGenericaParametros() {
		
	}
	public ClaseGenericaParametros(T o1, V o2) {
		obj1=o1;
		obj2=o2;
	}
	public T getObj1() {
		return obj1;
	}
	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}
	public V getObj2() {
		return obj2;
	}
	public void setObj2(V obj2) {
		this.obj2 = obj2;
	}
	
	//mostrar los tipos t y v
	public void mostrarTipos() {
		System.out.println("el tipo t es: " + obj1.getClass().getName());
		System.out.println("el tipo v es: " + obj2.getClass().getName());
	}
	
}
