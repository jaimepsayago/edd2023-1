package com.pucese.pilasycolas;

public class ArrayQueue<E> implements Queue<E> {
	//variables
	private E[] data;
	private int f=0; //indice
	private int sz=0;
	public static final int CAPACITY = 1000;

	public ArrayQueue() {
		this(CAPACITY);
	}
	@SuppressWarnings("unchecked")
	public ArrayQueue(int capacity) {
		data=(E []) new Object[capacity];
	}
	
	@Override
	public int size() {
		return sz;
	}
	@Override
	public boolean isEmpty() {
		return (sz == 0);
	}
	@Override
	public void enqueue(E e) {
		if (sz == data.length) throw new IllegalStateException("cola esta llena");
		int avail = (f + sz) % data.length;
		data[avail] = e;
		sz++;
		
	}

	@Override
	public E first() {
		if (isEmpty()) return null;
		return data[f];
	}

	@Override
	public E dequeue() {
		if (isEmpty()) return null;
		E res = data[f];
		data[f]=null;
		//reobtener le indicel del tamanio
		f=(f+1) % data.length;
		sz--;
		return res;
		
	}

}






