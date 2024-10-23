package org.example;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;


public class Partido {
	private Date fecha;
	private String resultado;
	private List<Equipo> equipos;
	private Cancha cancha;

	public Partido() {
		equipos = new ArrayList<>();
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public void agregarEquipo(Equipo equipo) {
		if (equipos.size() < 2) {
			equipos.add(equipo);
		}
	}

	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public Cancha getCancha() {
		return cancha;
	}
}
