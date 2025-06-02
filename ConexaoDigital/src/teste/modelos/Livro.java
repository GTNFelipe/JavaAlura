package teste.modelos;

public class Livro {

    private String titulo;
    private String autor;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void exibirDetalhes(){
        System.out.println("Título do livro: " + titulo + ". Autor do livro: " + autor + ".");
    }
}
//Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar
//e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro