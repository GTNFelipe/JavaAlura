package Desafios1.modelos;

public class VerificadorPrimo extends NumerosPrimos{
    public void verificarSeEPrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + "não é primo.");
        }
    }
}
