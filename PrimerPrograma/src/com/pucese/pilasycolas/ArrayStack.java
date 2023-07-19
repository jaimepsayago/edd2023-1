package com.pucese.pilasycolas;

public class ArrayStack<E> implements Stack<E> {

	//tamano del array
	//constante
	public static final int CAPACITY=1000;
	//declarrar el array generico
	public E[] data;
	//vamos a declarr el valor del indice de elementos de la pila
	private int t=1;
	
	//constructor
	public ArrayStack() {
		this(CAPACITY);
	}
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		data=(E[]) new Object[capacity];
	}
	
	@Override
	public int size() {
		return (t +1);
	}

	@Override
	public boolean isEmpty() {
		return (t == -1) ;
	}
	@Override
	public void push(E e) {
		//1. verifidcar el tamano
		if (size() == data.length) throw new IllegalStateException("pila is full");
		//si no esta vacia la pila
		data[++t] = e;
		
	}
	@Override
	public E pop() {
		//si esta vacio
		if (isEmpty()) return null;
		//crear un objeto temporal y agregarlo
		E obj = data[t];
		data[t] = null; //borra el dato
		t--;
		return obj;
	}
	@Override
	public E top() {
		if (isEmpty()) return null;
		return data[t];
	}

}
