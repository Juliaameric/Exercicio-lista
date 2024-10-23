package lista_de_exercicio;

public class Principal3 {

		public static void main(String[] args) {
	        Livro livro = new Livro("O Alquimista", "Paulo Coelho");
	        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", livro);
	        biblioteca.exibirInfo();
	    }

}
