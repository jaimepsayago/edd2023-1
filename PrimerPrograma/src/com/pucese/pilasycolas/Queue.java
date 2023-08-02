package com.pucese.pilasycolas;

public interface Queue <E> {
	//declarar metodos y propiedades sin inicializar que van a ser utilizados 
	int a=12;
	//tamanio
	int size();
	
	//vacia
	boolean isEmpty();
	
	//insetar elemento
	void enqueue(E e);
	
	//retornar primer valor
	E first();
	
	//remover
	E dequeue();
	
	
}
