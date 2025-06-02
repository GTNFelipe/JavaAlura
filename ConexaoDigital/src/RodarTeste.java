import Desafios.modelos.*;
import teste.modelos.ContaBancaria;
import teste.modelos.IdadePessoa;
import teste.modelos.Livro;
import teste.modelos.Produtos;

public class RodarTeste {
    public static void main(String[] args) {
                Pessoa pessoa = new Pessoa();
        pessoa.saudacao();

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println(resultado);

        Musica musica = new Musica();
        musica.titulo = "Yeshua";
        musica.artista = "Jose Jr";
        musica.anoDeLancamento = 2019;

        musica.exibeFichaTecnica();
        musica.avalia(10);
        musica.avalia(8);
        musica.avalia(9);
        System.out.println("Quantidade de avalaiações: "+musica.numAvaliacoes);
        System.out.println("Média de avaliações: "+musica.pegaMedia());

        Carro carro = new Carro();
        carro.modelo = "Onix";
        carro.ano = 2014;
        carro.cor = "Vermelho";
        carro.exibeFichaTecnica();
        System.out.println("O carro tem: "+carro.calculaAno()+" anos de idade");

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Felipe";
        aluno1.idade = 24;
        aluno1.exibeInformacoesAluno();

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

        teste.modelos.Aluno aluno = new teste.modelos.Aluno();
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
