package Desafios.modelos;

public class Aluno {
    public String nome;
    public int idade;

    public void exibeInformacoesAluno(){
        System.out.println("O nome do aluno é: "+nome);
        System.out.println("A idade de "+nome+": "+idade);
    }
}
