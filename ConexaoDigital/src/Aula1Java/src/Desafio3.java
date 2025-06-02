import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int ladoQuadrado = 0;
        double raioCirculo = 0;
        double pi = 3.14;

        System.out.println("Digite 1 para calcular a área de um quadrado");
        System.out.println("Digite 2 para calcular a área de um círuculo");
        int escolha = leitura.nextInt();

        if (escolha == 1) {
            System.out.println("Digite o lado ou altura do quadrado.");
            ladoQuadrado = leitura.nextInt();
            System.out.println("A área do quadrado é: " + ladoQuadrado * ladoQuadrado +".");
        } else if (escolha == 2) {
            System.out.println("Digite o raio do círculo.");
            raioCirculo = leitura.nextDouble();

            double area = pi * (raioCirculo * raioCirculo);
            System.out.println("A área do círculo é : " + area + ".");

        }
    }
}
