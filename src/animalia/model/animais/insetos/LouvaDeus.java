package animalia.model.animais.insetos;

import animalia.model.animais.Inseto;

public class LouvaDeus extends Inseto{

	public LouvaDeus(String nome, String cor, String alimentacao, String habitat) {
		super(nome, cor, alimentacao, habitat);
	}

	@Override
	public void emitirSom() {
		System.out.println("chonk chonk *cabeça sendo comida*");
	}
	

}
