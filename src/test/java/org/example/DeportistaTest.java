package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeportistaTest {

    @Test
    void testGetSetNombre() {
        Deportista deportista = new Deportista();
        deportista.setNombre("Juan");
        assertEquals("Juan", deportista.getNombre());
    }

    @Test
    void testGetSetApellido() {
        Deportista deportista = new Deportista();
        deportista.setApellido("Pérez");
        assertEquals("Pérez", deportista.getApellido());
    }

    @Test
    void testGetSetContacto() {
        Deportista deportista = new Deportista();
        deportista.setContacto("123456789");
        assertEquals("123456789", deportista.getContacto());
    }

    @Test
    void testGetSetDeporte() {
        Deportista deportista = new Deportista();
        deportista.setDeporte("Futbol");
        assertEquals("Futbol", deportista.getDeporte());
    }
}
