package uni1a;

public class Streaming extends ContenidoAudiovisual {
    private String plataforma;
    private String idiomaOriginal;
    private boolean esOriginal;
    private Investigador investigador;

    public Streaming(String titulo, int duracionEnMinutos, String genero,
                     String plataforma, String idiomaOriginal, boolean esOriginal) {
        super(titulo, duracionEnMinutos, genero);
        this.plataforma = plataforma;
        this.idiomaOriginal = idiomaOriginal;
        this.esOriginal = esOriginal;
    }

    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    public String getIdiomaOriginal() { return idiomaOriginal; }
    public void setIdiomaOriginal(String idiomaOriginal) { this.idiomaOriginal = idiomaOriginal; }

    public boolean isEsOriginal() { return esOriginal; }
    public void setEsOriginal(boolean esOriginal) { this.esOriginal = esOriginal; }

    public Investigador getInvestigador() { return investigador; }
    public void setInvestigador(Investigador investigador) { this.investigador = investigador; }

    @Override
    public void mostrarDetalles() {
        mostrarDetallesBase();
    }
}
