import java.util.Scanner;

public class Desafio7 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("Insira um número");
        int numero1 = l.nextInt();
        System.out.println("Insira outro número");
        int numero2 = l.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        } else if (numero1 > numero2) {
            System.out.println(numero1 + " é maior que " + numero2);
        } else {
            System.out.println(numero1+" é menor que "+numero2);
        }
    }
}
