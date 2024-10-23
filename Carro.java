package lista_de_exercicio;

public class Carro extends Brinquedo {
	public Carro(String cor, String tipo, int velocidade, String nome) {
		super(cor, tipo, velocidade, nome);
	}
	
	public void mover() {
		System.out.println("o carro esta se movendo");
	}
}

