package animalia.model.animais.aves;

import animalia.interfaces.Voar;
import animalia.model.animais.Ave;

public class Pinguin extends Ave implements Voar {

	public Pinguin(String nome, String cor, String alimentacao, String habitat) {
		super(nome, cor, alimentacao, habitat);
	}

	@Override
	public void emitirSom() {

		System.out.println("Barulho de pinguin inserted");

	}

	@Override
	public void voar() {

		System.out.println("Infelizmente eu não Vôo, mas seria de grande ajuda para fugir dos ursos não acha?");

	}

	@Override
	public void tetrapoda() {
		System.out.println("Eu sou um tetrapoda!");

	}

}
