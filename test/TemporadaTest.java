package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemporadaTest {

    private Temporada temporada;

    @BeforeEach
    void setUp() {
        temporada = new Temporada(1, 220, "2002");
    }

    @Test
    void testCrearTemporada_atributosCorrectos() {
        assertEquals(1, temporada.getNumero());
        assertEquals(220, temporada.getCantidadEpisodios());
        assertEquals("2002", temporada.getFechaEstreno());
    }

    @Test
    void testSetNumero_actualizaValor() {
        temporada.setNumero(2);
        assertEquals(2, temporada.getNumero());
    }

    @Test
    void testSetCantidadEpisodios_actualizaValor() {
        temporada.setCantidadEpisodios(10);
        assertEquals(10, temporada.getCantidadEpisodios());
    }

    @Test
    void testSetFechaEstreno_actualizaValor() {
        temporada.setFechaEstreno("2005");
        assertEquals("2005", temporada.getFechaEstreno());
    }

    @Test
    void testMostrarDetalles_noLanzaExcepcion() {
        assertDoesNotThrow(() -> temporada.mostrarDetalles());
    }
}
