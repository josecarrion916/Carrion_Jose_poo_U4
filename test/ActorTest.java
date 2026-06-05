package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ActorTest {

    private Actor actor;

    @BeforeEach
    void setUp() {
        actor = new Actor("Junko Takeuchi", "Naruto Uzumaki", 50);
    }

    @Test
    void testCrearActor_atributosCorrectos() {
        assertEquals("Junko Takeuchi", actor.getNombre());
        assertEquals("Naruto Uzumaki", actor.getRol());
        assertEquals(50, actor.getEdad());
    }

    @Test
    void testSetNombre_actualizaValor() {
        actor.setNombre("Maile Flanagan");
        assertEquals("Maile Flanagan", actor.getNombre());
    }

    @Test
    void testSetRol_actualizaValor() {
        actor.setRol("Naruto (doblaje ingles)");
        assertEquals("Naruto (doblaje ingles)", actor.getRol());
    }

    @Test
    void testSetEdad_actualizaValor() {
        actor.setEdad(45);
        assertEquals(45, actor.getEdad());
    }

    @Test
    void testMostrarDetalles_noLanzaExcepcion() {
        assertDoesNotThrow(() -> actor.mostrarDetalles());
    }
}