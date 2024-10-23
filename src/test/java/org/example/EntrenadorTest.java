package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;

class EntrenadorTest {

    private Set<Entrenador> entrenadoresRegistrados = new HashSet<>();

    private boolean registrarEntrenador(Entrenador entrenador) {
        return entrenadoresRegistrados.add(entrenador);
    }

    @Test
    void testRegistrarEntrenador() {
        Entrenador entrenador = new Entrenador();
        entrenador.setNombre("Pedro");

        assertTrue(registrarEntrenador(entrenador));
    }

    @Test
    void testEvitarDuplicados() {
        Entrenador entrenador = new Entrenador();
        entrenador.setNombre("Pedro");

        registrarEntrenador(entrenador);

        Entrenador duplicado = new Entrenador();
        duplicado.setNombre("Pedro");

        assertFalse(registrarEntrenador(duplicado));
    }
}
