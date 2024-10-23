package org.example;

import java.util.Date;

public class Cancha {
	private String tipoSuperficie;
	private String ubicacion;
	private int capacidad;

	public String getTipoSuperficie() {
		return tipoSuperficie;
	}

	public void setTipoSuperficie(String tipoSuperficie) {
		this.tipoSuperficie = tipoSuperficie;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	// Métodos adicionales
	public void reservar(Date fecha, Partido partido) {
		// Lógica para reservar la cancha
	}

	public boolean consultarDisponibilidad(Date fecha) {
		// Lógica para consultar disponibilidad
		return true; // Ejemplo, esto debería comprobar si la cancha está disponible
	}
}
