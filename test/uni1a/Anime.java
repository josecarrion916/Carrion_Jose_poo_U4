package uni1a;

public class Anime extends ContenidoAudiovisual {
    private String estudio;
    private int episodios;
    private String temporada;

    private Actor actor;
    private Temporada temp;

    public Anime(String titulo, int duracionEnMinutos, String genero,
                 String estudio, int episodios, String temporada) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.episodios = episodios;
        this.temporada = temporada;
    }

    public String getEstudio() { return estudio; }
    public int getEpisodios() { return episodios; }
    public String getTemporada() { return temporada; }
    public Actor getActor() { return actor; }
    public Temporada getTemp() { return temp; }

    public void setActor(Actor actor) { this.actor = actor; }
    public void setTemporada(Temporada temp) { this.temp = temp; }

    @Override
    public void mostrarDetalles() {
        mostrarDetallesBase();
    }
}
