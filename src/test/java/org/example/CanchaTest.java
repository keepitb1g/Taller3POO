package org.example;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class CanchaTest {

    @Test
    void testGestionCanchas() {
        Cancha cancha = new Cancha();
        Date fecha = new Date();

        assertTrue(cancha.consultarDisponibilidad(fecha));

        Partido partido = new Partido();
        partido.setFecha(fecha);
        cancha.reservar(fecha, partido);

        assertFalse(cancha.consultarDisponibilidad(fecha));
    }
}
