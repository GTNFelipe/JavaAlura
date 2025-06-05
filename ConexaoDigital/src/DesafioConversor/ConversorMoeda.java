package DesafioConversor;

import DesafioConversor.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    public static void main(String[] args) {

    }

    @Override
    public double converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.63;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$ " + valorReal);
        return cotacaoDolar;
    }
    }
