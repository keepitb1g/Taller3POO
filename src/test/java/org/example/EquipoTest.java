package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EquipoTest {

    @Test
    void testAsignarDeportista() {
        Equipo equipo = new Equipo();
        Deportista deportista = new Deportista();
        deportista.setNombre("Luis");

        equipo.agregarDeportista(deportista);
        assertEquals(1, equipo.getDeportistas().size());

        Equipo equipo2 = new Equipo();
        equipo2.agregarDeportista(deportista);
        assertFalse(equipo2.getDeportistas().contains(deportista)); // duplicados
    }

    @Test
    void testAsignarEntrenador() {
        Equipo equipo = new Equipo();
        Entrenador entrenador = new Entrenador();
        entrenador.setNombre("Carlos");

        equipo.setEntrenador(entrenador);
        assertEquals("Carlos", equipo.getEntrenador().getNombre());

        Equipo equipo2 = new Equipo();
        equipo2.setEntrenador(entrenador);
        assertNull(equipo2.getEntrenador()); // solo 1 entrenador
    }
}
