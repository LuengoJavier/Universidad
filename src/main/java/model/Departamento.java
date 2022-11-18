package model;

import java.util.ArrayList;
import model.Administrativo;
import model.Profesor;
import model.CarreraUniversitaria;

public class Departamento {
	private final String nombre;
	private final ArrayList<Administrativo> administradores = new ArrayList<Administrativo>();
	private final ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	private final ArrayList<CarreraUniversitaria> carreras = new ArrayList<CarreraUniversitaria>();

	public String getNombre() {
		return this.nombre;
	}
	public Departamento(String nombre){
		this.nombre = nombre;
	}
	public ArrayList<Profesor> getProfesor() {
		return profesores;
	}
	public ArrayList<CarreraUniversitaria> getCarreras() {
		return carreras;
	}
	public ArrayList<Administrativo> getAdministradores() {
		return administradores;
	}

}