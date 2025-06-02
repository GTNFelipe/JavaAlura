package DigitalConexao.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoeos;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;


    }


    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: "+nome);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
        System.out.println("Avaliação do filme: "+ somaAvaliacoeos);
        System.out.println("Duração do filme em minutos: "+duracaoEmMinutos);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void avalia(double nota){
        somaAvaliacoeos += nota;
        totalDeAvaliacoes++;

    }

    public double pegaMedia(){
        return somaAvaliacoeos / totalDeAvaliacoes;
    }

}


