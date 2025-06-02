package Aula1Java.src;
import java.text.DecimalFormat;

public class Desafio0 {
    public static void main(String[] args) {

    double nota1 = 7.8;
    double nota2 = 8.9;
    int media = (int) (nota1 + nota2) / 2;

    System.out.println(media);

    char letra = 'A';
    String palavra = "becedário";

    System.out.println(letra + palavra);

    double precoProduto = 257.80;
    int quantidade = 40;
    int precoTotal = (int) precoProduto * quantidade;

    System.out.println(precoTotal);

    double valorEmDolares = 4.97;
    double reais = 4.94;

    double dolarEmReais = valorEmDolares / reais;

    DecimalFormat df = new DecimalFormat("#.00"); // Formato com 2 casas decimais

    System.out.println(df.format(dolarEmReais));

double precoOriginal = 299.99;
double percentualDesconto = 10;
double precoComDesconto = percentualDesconto / 100 * precoOriginal;

System.out.println("O preço original é: R$"+ precoOriginal);
        System.out.println("Novo preço com desconto fica R$"+precoComDesconto);
    }
}
