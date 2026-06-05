package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PeliculaTest {

    @Test
    void testCrearPelicula() {

        Pelicula pelicula =
                new Pelicula(
                        "Avatar",
                        125,
                        "Accion",
                        "20th Century Studios");

        assertEquals("Avatar", pelicula.getTitulo());
        assertEquals(125, pelicula.getDuracionEnMinutos());
        assertEquals("Accion", pelicula.getGenero());
        assertEquals("20th Century Studios", pelicula.getEstudio());
    }

    @Test
    void testSetTitulo() {
        Pelicula pelicula = new Pelicula("Titanic", 194, "Drama", "Paramount");
        pelicula.setTitulo("Titanic 2");
        assertEquals("Titanic 2", pelicula.getTitulo());
    }

    @Test
    void testSetEstudio() {
        Pelicula pelicula = new Pelicula("Titanic", 194, "Drama", "Paramount");
        pelicula.setEstudio("Universal");
        assertEquals("Universal", pelicula.getEstudio());
    }
}
