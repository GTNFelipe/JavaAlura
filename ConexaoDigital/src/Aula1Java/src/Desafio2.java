import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número");
        int numeroEntrada = leitura.nextInt();


        if (numeroEntrada >= 0) {
            System.out.println("Número positivo");

        } else {
            System.out.println("O número é negativo");
        }
    }
}
