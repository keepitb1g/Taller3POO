package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class EquipoTest {

    @Test
    void testCrearEquipo() {
        Equipo equipo = new Equipo();
        equipo.setNombre("Equipo A");
        assertEquals("Equipo A", equipo.getNombre());
    }

    @Test
    void testAsignarDeportistasYEntrenador() {
        Equipo equipo = new Equipo();
        equipo.setNombre("Equipo A");

        Deportista deportista = new Deportista();
        deportista.setNombre("Luis");
        equipo.agregarDeportista(deportista);

        Entrenador entrenador = new Entrenador();
        entrenador.setNombre("Carlos");
        equipo.setEntrenador(entrenador);

        assertEquals(1, equipo.getDeportistas().size());
        assertEquals(entrenador, equipo.getEntrenador());
    }
}
