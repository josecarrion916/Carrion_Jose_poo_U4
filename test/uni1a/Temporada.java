package uni1a;

public class Temporada {
    private int numero;
    private int cantidadEpisodios;
    private String fechaEstreno;

    public Temporada(int numero, int cantidadEpisodios, String fechaEstreno) {
        this.numero = numero;
        this.cantidadEpisodios = cantidadEpisodios;
        this.fechaEstreno = fechaEstreno;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public int getCantidadEpisodios() { return cantidadEpisodios; }
    public void setCantidadEpisodios(int cantidadEpisodios) { this.cantidadEpisodios = cantidadEpisodios; }

    public String getFechaEstreno() { return fechaEstreno; }
    public void setFechaEstreno(String fechaEstreno) { this.fechaEstreno = fechaEstreno; }

    public void mostrarDetalles() {
        System.out.println("   • Temporada " + numero + ": " + cantidadEpisodios + 
                          " episodios (Estreno: " + fechaEstreno + ")");
    }
}