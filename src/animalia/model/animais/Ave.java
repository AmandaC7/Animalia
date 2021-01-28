package animalia.model.animais;

import animalia.interfaces.membros.Tetrapoda;

public abstract class Ave extends Animal implements Tetrapoda{

	public Ave(String nome, String cor, String alimentacao, String habitat) {
		super(nome, cor, alimentacao, habitat);
	}


	
}
