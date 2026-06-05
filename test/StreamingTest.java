package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StreamingTest {

    private Streaming streaming;

    @BeforeEach
    void setUp() {
        streaming = new Streaming("Cosmos", 45, "Science", "Netflix", "Ingles", true);
    }

    // --- Creación ---

    @Test
    void testCrearStreaming_atributosCorrectos() {
        assertEquals("Cosmos", streaming.getTitulo());
        assertEquals(45, streaming.getDuracionEnMinutos());
        assertEquals("Science", streaming.getGenero());
        assertEquals("Netflix", streaming.getPlataforma());
        assertEquals("Ingles", streaming.getIdiomaOriginal());
        assertTrue(streaming.isEsOriginal());
    }

    @Test
    void testContenidoNoOriginal_retornaFalse() {
        Streaming noOriginal = new Streaming("Titulo", 30, "Drama", "HBO", "Espanol", false);
        assertFalse(noOriginal.isEsOriginal());
    }

    // --- Setters ---

    @Test
    void testSetPlataforma_actualizaValor() {
        streaming.setPlataforma("Amazon Prime");
        assertEquals("Amazon Prime", streaming.getPlataforma());
    }

    @Test
    void testSetIdioma_actualizaValor() {
        streaming.setIdiomaOriginal("Espanol");
        assertEquals("Espanol", streaming.getIdiomaOriginal());
    }

    @Test
    void testSetEsOriginal_actualizaValor() {
        streaming.setEsOriginal(false);
        assertFalse(streaming.isEsOriginal());
    }

    // --- Investigador asociado ---

    @Test
    void testAsociarInvestigador_seGuardaCorrectamente() {
        Investigador investigador = new Investigador("Carl Sagan", "Astronomia", "NASA");
        streaming.setInvestigador(investigador);
        assertEquals("Carl Sagan", streaming.getInvestigador().getNombre());
    }

    @Test
    void testSinInvestigador_esNullPorDefecto() {
        assertNull(streaming.getInvestigador());
    }

    @Test
    void testMostrarDetalles_noLanzaExcepcion() {
        assertDoesNotThrow(() -> streaming.mostrarDetalles());
    }

    @Test
    void testMostrarDetallesConInvestigador_noLanzaExcepcion() {
        streaming.setInvestigador(new Investigador("Carl Sagan", "Astronomia", "NASA"));
        assertDoesNotThrow(() -> streaming.mostrarDetalles());
    }
}
