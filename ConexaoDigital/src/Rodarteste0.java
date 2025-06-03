
import teste.modelos.*;

public class Rodarteste0 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumeroConta(01);
        contaBancaria.titular = "Felipe";

        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setIdade(24);
        idadePessoa.setNome("Felipe");
        idadePessoa.maioridade();

        Produtos produtos = new Produtos();
        produtos.setPreco(84.90);
        produtos.setNome("Bíblia");
        produtos.exibeDesconto();

        Aluno aluno = new Aluno();
        aluno.setNome("Felipe");
        aluno.pegaNota(8.5);
        aluno.pegaNota(9.7);
        aluno.pegaNota(1.5);
        aluno.pegaNota(10);
        aluno.exibeNota();

        Livro livro = new Livro();
        livro.setAutor("Charles Spurgeon");
        livro.setTitulo("Totalmente pela graça");
        livro.exibirDetalhes();


    }
}
