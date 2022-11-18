package model;

import java.util.ArrayList;
import model.Trabajador;
import model.Facultad;

public class Universidad {
	private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
	private ArrayList<Facultad> facultades = new ArrayList<Facultad>();

	public List<Profesor> obtenerPNombre(String nombre) {
		throw new UnsupportedOperationException();
	}

	public List<CarreraUniversitaria> obtenerCarreras() {
		throw new UnsupportedOperationException();
	}

	public List<Profesor> obtenerPJornada(String horario) {
		throw new UnsupportedOperationException();
	}

	public List<Profesor> obtenerProfesores() {
		throw new UnsupportedOperationException();
	}

	public List<Administrativo> obtenerAdministrativos() {
		throw new UnsupportedOperationException();
	}
}