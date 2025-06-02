package Desafios.modelos;

public class Carro {
public String modelo;
public int ano;
public String cor;

public void exibeFichaTecnica(){
    System.out.println("Modelo do carro: "+modelo);
    System.out.println("Ano do carro: "+ano);
    System.out.println("Cor do carro: "+cor);
}
 public int calculaAno(){
    return 2025 - ano;
 }
}
