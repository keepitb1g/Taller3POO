package org.example;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class PartidoTest {

    @Test
    void testRegistrarPartido() {
        Partido partido = new Partido();
        Date fecha = new Date();
        partido.setFecha(fecha);

        Equipo equipo1 = new Equipo();
        equipo1.setNombre("Equipo A");
        partido.agregarEquipo(equipo1);

        Equipo equipo2 = new Equipo();
        equipo2.setNombre("Equipo B");
        partido.agregarEquipo(equipo2);

        Cancha cancha = new Cancha();
        cancha.setTipoSuperficie("Césped");
        partido.setCancha(cancha);

        partido.setResultado("3-2");

        assertEquals(fecha, partido.getFecha());
        assertEquals(2, partido.getEquipos().size());
        assertEquals("Césped", partido.getCancha().getTipoSuperficie());
        assertEquals("3-2", partido.getResultado());
    }
}
