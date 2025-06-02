package DigitalConexao.modelos;

public class Serie extends Titulo {
    private int temporada;
    private int episodioPOrTemporada;
    private boolean ativa;
    private int minutosPOrEpisodio;

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodioPOrTemporada() {
        return episodioPOrTemporada;
    }

    public void setEpisodioPOrTemporada(int episodioPOrTemporada) {
        this.episodioPOrTemporada = episodioPOrTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPOrEpisodio() {
        return minutosPOrEpisodio;
    }

    public void setMinutosPOrEpisodio(int minutosPOrEpisodio) {
        this.minutosPOrEpisodio = minutosPOrEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporada * episodioPOrTemporada * minutosPOrEpisodio;
    }
}
