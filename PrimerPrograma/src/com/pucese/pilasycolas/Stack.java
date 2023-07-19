package com.pucese.pilasycolas;
//implementar pila generica con arrays
//aplicaciones genericas
//<E> reperesntar una clase, I interface o metodo generico
public interface Stack<E> {
	//es una clase donde se declaran metodos
	//no estan implementados y es generico
	
	//metodos
	//tamano de pila
	//si esta vacia
	public int size();
	boolean isEmpty();
	//insertar datos en la pila
	public void push(E e);
	//remover
	public E pop();
	//obetener el ultimo elemento de la pila
	public E top();
	
}
