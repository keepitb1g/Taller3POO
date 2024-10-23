package org.example;

import java.util.List;
import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private List<Deportista> deportistas;
	private Entrenador entrenador;

	public Equipo() {
		deportistas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarDeportista(Deportista deportista) {
		deportistas.add(deportista);
	}

	public void removerDeportista(Deportista deportista) {
		deportistas.remove(deportista);
	}

	public List<Deportista> getDeportistas() {
		return deportistas;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}
}
