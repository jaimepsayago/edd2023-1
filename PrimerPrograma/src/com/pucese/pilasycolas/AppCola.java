package com.pucese.pilasycolas;

import java.util.Iterator;
import java.util.LinkedList;

public class AppCola {

	public static void main(String[] args) {
		// cola de tda 
		Queue<Integer> s = new ArrayQueue<>();
		s.enqueue(8);
		s.enqueue(12);
		s.enqueue(16);
		
		System.out.println("el primero " + s.first());

		while( ! s.isEmpty()) {
			System.out.println(s.dequeue());
		}
		
		System.out.println("el primero " + s.first());
		
		//libvreria
		LinkedList<String> cola = new LinkedList<String>();
		cola.add("juan");
		cola.add("jose");
		cola.add("pedro");
		cola.add("maria");
		
		cola.addFirst("primero");
		cola.addLast("ultimo");
		
		//remover
		cola.remove(3);
		
		//buscar algun dato
		Object datoObtenido= cola.get(4);
		System.out.println("dato obetinido " + datoObtenido);
		
		Iterator<String> iteratorCola = cola.iterator();
		while(iteratorCola.hasNext()) {
			System.out.println(iteratorCola.next());
		}
		
	}

}















