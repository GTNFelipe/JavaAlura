package teste.modelos;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

   public void maioridade() {
        if (getIdade() >= 18) {
            System.out.println(getNome() + " é maior de idade");
        } else {
                System.out.println(getNome()+" é menor de idade");
        }
    }

}

//Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar
//esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.