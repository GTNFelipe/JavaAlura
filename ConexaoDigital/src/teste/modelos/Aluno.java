package teste.modelos;

public class Aluno {
    private String nome;
    private double nota;
    private double somaNotas;
    private double media;
    private int quantidadeNotas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setSomaNotas(double somaNotas) {
        this.somaNotas = somaNotas;
    }

    public void pegaNota(double nota) {
        somaNotas += nota;
        quantidadeNotas++;
    }

    public double calcularMedia() {
        if (quantidadeNotas == 0) return 0;
        return somaNotas / quantidadeNotas;
    }

    public void exibeNota() {
        System.out.println("A média de " + nome + " é: " + calcularMedia());
    }

}
//Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar
//esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.