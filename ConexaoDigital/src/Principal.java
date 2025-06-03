import DigitalConexao.calculos.CalculadoraDeTempo;
import DigitalConexao.modelos.Filme;
import DigitalConexao.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Matrix");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setDuracaoEmMinutos(136);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("House");
        serie.setAnoDeLancamento(2004);
        serie.exibeFichaTecnica();
        serie.setTemporada(8);
        serie.setEpisodioPOrTemporada(20);
        serie.setMinutosPOrEpisodio(40);
        System.out.println("Duração para maratonar House: " + serie.getDuracaoEmMinutos() + " minutos.");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());






    }
}