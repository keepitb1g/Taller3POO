package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;

class DeportistaTest {

    private Set<Deportista> deportistasRegistrados = new HashSet<>();

    private boolean registrarDeportista(Deportista deportista) {
        return deportistasRegistrados.add(deportista);
    }

    @Test
    void testRegistrarDeportista() {
        Deportista deportista = new Deportista();
        deportista.setNombre("Juan");
        deportista.setApellido("Pérez");

        assertTrue(registrarDeportista(deportista));
    }

    @Test
    void testEvitarDuplicados() {
        Deportista deportista = new Deportista();
        deportista.setNombre("Juan");
        deportista.setApellido("Pérez");

        registrarDeportista(deportista);

        Deportista duplicado = new Deportista();
        duplicado.setNombre("Juan");
        duplicado.setApellido("Pérez");

        assertFalse(registrarDeportista(duplicado));
    }
}
