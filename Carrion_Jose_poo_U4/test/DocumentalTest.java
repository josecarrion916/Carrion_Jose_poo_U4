package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DocumentalTest {

    @Test
    void testCrearDocumental() {

        Documental documental =
                new Documental(
                        "Cosmos",
                        45,
                        "Science",
                        "Astronomy");

        assertEquals("Cosmos", documental.getTitulo());
        assertEquals(45, documental.getDuracionEnMinutos());
        assertEquals("Science", documental.getGenero());
        assertEquals("Astronomy", documental.getTema());
    }

    @Test
    void testSetTema() {
        Documental documental = new Documental("Planet Earth", 50, "Nature", "Biology");
        documental.setTema("Ecology");
        assertEquals("Ecology", documental.getTema());
    }

    @Test
    void testSetGenero() {
        Documental documental = new Documental("Cosmos", 45, "Science", "Astronomy");
        documental.setGenero("Educativo");
        assertEquals("Educativo", documental.getGenero());
    }
}
