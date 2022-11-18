package model;

import String._horario___String;

public abstract class Trabajador {
	private String nombre;
	private String rut;
	private String estadoCivil;
	private String tituloP;
	private String direccion;
	private String horario;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getTituloP() {
		return this.tituloP;
	}

	public void setTituloP(String tituloP) {
		this.tituloP = tituloP;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHorario() {
		return this.horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Trabajador(String nombre, String rut, String estadoCivil, String tituloP, String horario, String direccion) {
		throw new UnsupportedOperationException();
	}

	public abstract String getTipo();
}