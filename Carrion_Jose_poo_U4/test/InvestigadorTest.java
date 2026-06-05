package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InvestigadorTest {

    private Investigador investigador;

    @BeforeEach
    void setUp() {
        investigador = new Investigador("Carl Sagan", "Astronomia", "NASA");
    }

    @Test
    void testCrearInvestigador_atributosCorrectos() {
        assertEquals("Carl Sagan", investigador.getNombre());
        assertEquals("Astronomia", investigador.getEspecialidad());
        assertEquals("NASA", investigador.getInstitucion());
    }

    @Test
    void testSetNombre_actualizaValor() {
        investigador.setNombre("Neil deGrasse Tyson");
        assertEquals("Neil deGrasse Tyson", investigador.getNombre());
    }

    @Test
    void testSetEspecialidad_actualizaValor() {
        investigador.setEspecialidad("Astrofisica");
        assertEquals("Astrofisica", investigador.getEspecialidad());
    }

    @Test
    void testSetInstitucion_actualizaValor() {
        investigador.setInstitucion("Hayden Planetarium");
        assertEquals("Hayden Planetarium", investigador.getInstitucion());
    }

    @Test
    void testMostrarDetalles_noLanzaExcepcion() {
        assertDoesNotThrow(() -> investigador.mostrarDetalles());
    }
}
