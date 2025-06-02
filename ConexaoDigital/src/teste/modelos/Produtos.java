package teste.modelos;

public class Produtos {
    private String nome;
    private double preco;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    double desconto() {
        return (10 / preco) * 100;
    }
    double descontoAplicado(){
        return preco -= desconto();

    }
    public void exibeDesconto() {
        System.out.println("O valor original da " + nome + " é: R$" + preco + " e o valor com desconto é de: R$" + descontoAplicado());
    }
}

//Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters
//para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
