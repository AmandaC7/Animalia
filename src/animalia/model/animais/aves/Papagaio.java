package animalia.model.animais.aves;

import animalia.interfaces.Voar;
import animalia.model.animais.Ave;

public class Papagaio extends Ave implements Voar{

	
	public Papagaio(String nome, String cor, String alimentacao, String habitat) {
		super(nome, cor, alimentacao, habitat);
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + ": Cad� o " + getNome() + "?");
	}

	@Override
	public void voar() {
		System.out.println(getNome() + ": Eu v�o!");
	}

	@Override
	public void tetrapoda() {
		System.out.println(getNome() + ": Eu sou um tetrapoda!");
		
	}

}
