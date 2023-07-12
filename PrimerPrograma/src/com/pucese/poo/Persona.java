package com.pucese.poo;

import java.util.Objects;

public class Persona {
	//propiedades
	public String dni; 
	public String nombre;
	private int contrasenia;
	protected String direccion;
	
	
	public Persona() {
		
	}
	
	public Persona(String dni, String nombre, int contrasenia, String direccion) {
		this.dni=dni;
		this.nombre=nombre;
		this.contrasenia=contrasenia;
		this.direccion=direccion;
	}
	//getters and setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(int contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//metodos equals and toString
	@Override
	public int hashCode() {
		return Objects.hash(contrasenia, direccion, dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return contrasenia == other.contrasenia && Objects.equals(direccion, other.direccion)
				&& Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", contrasenia=" + contrasenia + ", direccion="
				+ direccion + "]";
	}

	
	

	
	
	
	
	
}
