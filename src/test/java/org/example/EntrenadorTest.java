package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EntrenadorTest {

    @Test
    void testGetSetNombre() {
        Entrenador entrenador = new Entrenador();
        entrenador.setNombre("Pedro");
        assertEquals("Pedro", entrenador.getNombre());
    }

    @Test
    void testGetSetExperiencia() {
        Entrenador entrenador = new Entrenador();
        entrenador.setExperiencia("5 años");
        assertEquals("5 años", entrenador.getExperiencia());
    }

    @Test
    void testGetSetDeporteEspecializacion() {
        Entrenador entrenador = new Entrenador();
        entrenador.setDeporteEspecializacion("Baloncesto");
        assertEquals("Baloncesto", entrenador.getDeporteEspecializacion());
    }
}
