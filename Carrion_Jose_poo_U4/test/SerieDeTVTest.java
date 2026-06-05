package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SerieDeTVTest {

    @Test
    void testCrearSerie() {

        SerieDeTV serie =
                new SerieDeTV(
                        "Game of Thrones",
                        60,
                        "Fantasy",
                        8);

        assertEquals("Game of Thrones", serie.getTitulo());
        assertEquals(60, serie.getDuracionEnMinutos());
        assertEquals("Fantasy", serie.getGenero());
        assertEquals(8, serie.getTemporadas());
    }

    @Test
    void testSetTemporadas() {
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 47, "Drama", 5);
        serie.setTemporadas(6);
        assertEquals(6, serie.getTemporadas());
    }

    @Test
    void testSetTitulo() {
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 47, "Drama", 5);
        serie.setTitulo("Breaking Bad: Origins");
        assertEquals("Breaking Bad: Origins", serie.getTitulo());
    }
}
