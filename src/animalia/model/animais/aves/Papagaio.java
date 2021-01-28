package animalia.model.animais.aves;

import animalia.interfaces.Voar;
import animalia.model.animais.Ave;

public class Papagaio extends Ave implements Voar{

	
	public Papagaio(String nome, String cor, String alimentacao, String habitat) {
		super(nome, cor, alimentacao, habitat);
	}

	@Override
	public void emitirSom() {
		System.out.println("Cadê o " + getNome());
	}

	@Override
	public void voar() {
		System.out.println("Eu vôo!");
	}

	@Override
	public void tetrapoda() {
		System.out.println("Eu sou um tetrapoda!");
		
	}

}
