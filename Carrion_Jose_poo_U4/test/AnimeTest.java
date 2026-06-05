package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnimeTest {

    private Anime anime;

    @BeforeEach
    void setUp() {
        anime = new Anime("Naruto", 24, "Anime", "Studio Pierrot", 220, "Primera");
    }

    // --- Creación ---

    @Test
    void testCrearAnime_atributosCorrectos() {
        assertEquals("Naruto", anime.getTitulo());
        assertEquals(24, anime.getDuracionEnMinutos());
        assertEquals("Anime", anime.getGenero());
        assertEquals("Studio Pierrot", anime.getEstudio());
        assertEquals(220, anime.getEpisodios());
        assertEquals("Primera", anime.getTemporada());
    }

    // --- Actor asociado ---

    @Test
    void testAsociarActor_seGuardaCorrectamente() {
        Actor actor = new Actor("Junko Takeuchi", "Naruto Uzumaki", 50);
        anime.setActor(actor);
        assertEquals("Junko Takeuchi", anime.getActor().getNombre());
    }

    @Test
    void testSinActor_esNullPorDefecto() {
        assertNull(anime.getActor());
    }

    // --- Temporada asociada ---

    @Test
    void testAsociarTemporada_seGuardaCorrectamente() {
        Temporada temporada = new Temporada(1, 220, "2002");
        anime.setTemporada(temporada);
        assertEquals(1, anime.getTemp().getNumero());
        assertEquals(220, anime.getTemp().getCantidadEpisodios());
    }

    @Test
    void testSinTemporada_esNullPorDefecto() {
        assertNull(anime.getTemp());
    }

    // --- mostrarDetalles ---

    @Test
    void testMostrarDetalles_noLanzaExcepcion() {
        assertDoesNotThrow(() -> anime.mostrarDetalles());
    }

    @Test
    void testMostrarDetallesConActorYTemporada_noLanzaExcepcion() {
        anime.setActor(new Actor("Junko Takeuchi", "Naruto Uzumaki", 50));
        anime.setTemporada(new Temporada(1, 220, "2002"));
        assertDoesNotThrow(() -> anime.mostrarDetalles());
    }
}
