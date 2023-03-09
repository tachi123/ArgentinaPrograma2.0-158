package miprimerproyecto.Entidades;

import java.time.LocalDateTime;

public class Persona {
	
	private String nombre;
	private String apellido;
	private LocalDateTime fechaDeNacimiento;
		
	public Persona(String nombre, String apellido) {
		this.setNombre(nombre);
		this.setApellido(apellido);		
	}
	
	//Dejo el metodo que setea atributos similar al constructor
	public void setAtributos(String nombre, String apellido) {
		this.setNombre(nombre);
		this.setApellido(apellido);		
	}	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDateTime getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDateTime fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	

}
