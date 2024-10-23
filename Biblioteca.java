package lista_de_exercicio;

public class Biblioteca {
	 private String nome;
	 private Livro livro; 

	    public Biblioteca(String nome, Livro livro) {
	        this.nome = nome;
	        this.livro = livro;
	    }

	    public void exibirInfo() {
	        System.out.println("Biblioteca: " + nome);
	        if (livro != null) {
	            System.out.println("Livro: " + livro.getTitulo());
	            System.out.println("Autor: " + livro.getAutor());
	        } else {
	            System.out.println("Nenhum livro disponível.");
	        }
	    }
}
