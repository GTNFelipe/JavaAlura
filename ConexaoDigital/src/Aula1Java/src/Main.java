public class Main {
    public static void main (String[] args) {
        System.out.println("Esse é o Conexão digital");
        System.out.println("Filme: O abutre");

        int ano = 2014;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        // Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 +8.0) / 3;
        System.out.println("Nota do filme: " + media);
        String sinopse;
        sinopse = """
                Para enfrentar dificuldades de conseguir um emprego formal, 
                o jovem Louis Bloom (Jake Gyllenhaal) decide entrar no 
                agitado submundo do jornalismo criminal independente de 
                Los Angeles. A fórmula é correr atrás de crimes e acidentes 
                chocantes, registrar tudo e vender a história para veículos interessados.
                """ + ano;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}