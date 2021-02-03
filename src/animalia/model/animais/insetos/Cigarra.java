package animalia.model.animais.insetos;

import animalia.model.animais.Inseto;

public class Cigarra extends Inseto{

	public Cigarra(String nome, String cor, String alimentacao, String habitat) {
		super(nome, cor, alimentacao, habitat);
	}

	@Override
	public void emitirSom() {
		System.out.println("cricri");
		
	}

}
