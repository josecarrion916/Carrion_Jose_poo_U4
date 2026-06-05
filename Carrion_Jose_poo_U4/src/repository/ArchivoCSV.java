package repository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import uni1a.ContenidoAudiovisual;

public class ArchivoCSV implements RepositorioContenido {

    private static final String ARCHIVO = "contenidos.csv";
    @SuppressWarnings("CallToPrintStackTrace")
    public void guardar(ContenidoAudiovisual[] contenidos) {

        try (BufferedWriter bw =
                new BufferedWriter(
                        new FileWriter(ARCHIVO))) {

            for (ContenidoAudiovisual contenido : contenidos) {

                if (contenido != null) {

                    bw.write(
                            contenido.getTitulo() + "," +
                            contenido.getDuracionEnMinutos() + "," +
                            contenido.getGenero()
                    );

                    bw.newLine();
                }
            }

            File archivoCreado = new File(ARCHIVO);

            System.out.println("\n=================================");
            System.out.println("Archivo CSV guardado correctamente");
            System.out.println("Ruta:");
            System.out.println(archivoCreado.getAbsolutePath());
            System.out.println("=================================\n");

        } catch (IOException e) {

            System.out.println("Error al guardar el archivo:");
            e.printStackTrace();
        }
    }

    @Override
    public void guardar() {
        System.out.println(
                "Use guardar(ContenidoAudiovisual[] contenidos)");
    }

    @Override
    public void cargar() {

        try (BufferedReader br =
                new BufferedReader(
                        new FileReader(ARCHIVO))) {

            String linea;

            System.out.println("\n===== CONTENIDO DEL CSV =====");

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            System.out.println("=============================\n");

        } catch (IOException e) {

            System.out.println("Error al leer el archivo:");
            e.printStackTrace();
        }
    }
}