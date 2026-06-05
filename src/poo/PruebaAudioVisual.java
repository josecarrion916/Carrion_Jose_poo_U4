package poo;

import repository.ArchivoCSV;
import uni1a.*;

public class PruebaAudioVisual {

    public static void main(String[] args) {

        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");

        // Streaming
        contenidos[3] = new Streaming("Cosmos", 45, "Science", "Netflix", "Inglés", true);
        ((Streaming) contenidos[3]).setInvestigador(
                new Investigador("Carl Sagan", "Astronomía", "NASA")
        );

        // Anime
        contenidos[4] = new Anime("Naruto", 24, "Anime", "Studio Pierrot", 220, "Primera");
        ((Anime) contenidos[4]).setActor(
                new Actor("Junko Takeuchi", "Naruto Uzumaki", 50)
        );
        ((Anime) contenidos[4]).setTemporada(
                new Temporada(1, 220, "2002")
        );

        // Mostrar resultados
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }

        // CSV (SOLO UNA VEZ)
        System.out.println("Llegué al CSV");

        ArchivoCSV archivo = new ArchivoCSV();

        archivo.guardar(contenidos);

        archivo.cargar();
    }
}