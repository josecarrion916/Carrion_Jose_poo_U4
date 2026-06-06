package repository;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import uni1a.ContenidoAudiovisual;
import uni1a.Pelicula;

public class ArchivoCSVTest {

    private static final String ARCHIVO_CSV = "contenidos.csv";

    @AfterEach
    void limpiarArchivo() {
        File csv = new File(ARCHIVO_CSV);
        if (csv.exists()) {
            csv.delete();
        }
    }

    @Test
    void testGuardarCSV() {

        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[1];

        contenidos[0] = new Pelicula(
                "Avatar",
                125,
                "Accion",
                "20th Century Studios");

        ArchivoCSV archivo = new ArchivoCSV();
        archivo.guardar(contenidos);

        File csv = new File(ARCHIVO_CSV);
        assertTrue(csv.exists(), "El archivo CSV debería haberse creado");
    }

    @Test
    void testGuardarCSVConVariosContenidos() {

        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[2];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new Pelicula("Titanic", 194, "Drama", "Paramount");

        ArchivoCSV archivo = new ArchivoCSV();
        archivo.guardar(contenidos);

        File csv = new File(ARCHIVO_CSV);
        assertTrue(csv.exists(), "El archivo CSV debería existir con múltiples contenidos");
        assertTrue(csv.length() > 0, "El archivo CSV no debería estar vacío");
    }

    @Test
    void testGuardarCSVConNulos() {

        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[2];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = null;

        ArchivoCSV archivo = new ArchivoCSV();
        archivo.guardar(contenidos);

        File csv = new File(ARCHIVO_CSV);
        assertTrue(csv.exists(), "El archivo CSV debería crearse aunque haya nulos en el array");
    }
}
