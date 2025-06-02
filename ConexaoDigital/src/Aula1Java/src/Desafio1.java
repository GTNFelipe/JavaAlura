import java.util.Random;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner desafio = new Scanner(System.in);
        int tentativas = 0;

        System.out.println("Olá, esse é o desafio de adivinhe o número em 5 tentativas. Vamos começar!");


        while (tentativas < 5) {
            System.out.println("Digite um número entre 0 a 100");
            int numero = desafio.nextInt();
            tentativas++;

            if (numero < numeroAleatorio) {
                System.out.println("O número certo é maior");
                System.out.println("Digite um outro número entre 0 a 100");
                numero = desafio.nextInt();
            } else if (numero > numeroAleatorio) {
                System.out.println("O número certo é menor");
                System.out.println("Digite um outro número entre 0 a 100");
                numero = desafio.nextInt();
            } else if (tentativas == 5) {
                System.out.println("Você não conseguiu acertar o número dentro de 5 tentativas. O número certo era " + numeroAleatorio);
                break;
            }
            else {
                System.out.println("Parabéns, você acertou o número secreto!");
                break;
            }
        }

        }
    }
//import java.util.Random;  Correção
//import java.util.Scanner;
//
//public class Adivinhacao {
//
//    public static void main(String[] args) {
//        Scanner leitor = new Scanner(System.in);
//        int numeroGerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
//        int tentativas = 0;
//        int numeroDigitado = 0;
//
//        while (tentativas < 5) {
//            System.out.print("Digite um número entre 0 e 100: ");
//            numeroDigitado = leitor.nextInt();
//            tentativas++;
//
//            if (numeroDigitado == numeroGerado) {
//                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
//                break; // interrompe o loop while
//            } else if (numeroDigitado < numeroGerado) {
//                System.out.println("O número digitado é menor que o número gerado.");
//            } else {
//                System.out.println("O número digitado é maior que o número gerado.");
//            }
//        }
//
//        if (tentativas == 5 && numeroDigitado != numeroGerado) {
//            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
//        }
//    }
//}

