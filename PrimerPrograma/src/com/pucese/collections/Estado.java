package com.pucese.collections;

import java.util.Objects;

public class Estado {
	
	private int idEstado;
	private String nombre;
	private int numeroHabitantes;
	
	public Estado() {
		
	}
	public Estado(int idEstado, String nombre, int numeroHabitantes) {
		this.idEstado=idEstado;
		this.nombre=nombre;
		this.numeroHabitantes=numeroHabitantes;
	}
	public int getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroHabitantes() {
		return numeroHabitantes;
	}
	public void setNumeroHabitantes(int numeroHabitantes) {
		this.numeroHabitantes = numeroHabitantes;
	}
	//toString mostrar los datos de la clases
	@Override
	public String toString() {
		return "Estado [idEstado=" + idEstado + ", nombre=" + nombre + ", numeroHabitantes=" + numeroHabitantes + "]";
	}
	//hashcodo sive para comparaciones pero mucho mas rapidas ojbeto en entero para comparar
	@Override
	public int hashCode() {
		return Objects.hash(idEstado, nombre, numeroHabitantes);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return idEstado == other.idEstado && Objects.equals(nombre, other.nombre)
				&& numeroHabitantes == other.numeroHabitantes;
	}
	
	//hashcode y equals = compraraciones entre los objetos y propiedades
	
	
	
	
	

}
