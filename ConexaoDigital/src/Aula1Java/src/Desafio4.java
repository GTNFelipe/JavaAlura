import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número para ser multiplicado: ");

        int fatorial = 0;
        String vezes = " X ";
        int numeroRecebido = leitura.nextInt();


        while ( fatorial < 10) {
            fatorial++;
            int multiplicacao = (numeroRecebido * fatorial);
            System.out.println(numeroRecebido + vezes + fatorial + " = " + multiplicacao);
        }
    }
}
