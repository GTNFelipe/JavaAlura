import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        int numero;
        System.out.println("Digite um número inteiro");
        numero = leitura.nextInt();
        int calculo = numero * numero;

        if (calculo % 2 == 0) {
            System.out.println("O "+ numero + " é par");
        } else {
            System.out.println("O "+ numero +" é impar");
        }
    }
}
