package Desafios.modelos;

public class Musica {
    public String titulo;
    public String artista;
    public int anoDeLancamento;
    public double avaliacao;
    public int numAvaliacoes;

    public void exibeFichaTecnica(){
        System.out.println("Título: "+titulo);
        System.out.println("Artista: "+artista);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
    }
    public void avalia (double nota){
        avaliacao += nota;
        numAvaliacoes++;

    }
    public double pegaMedia(){
        return avaliacao / 3;
    }
}
