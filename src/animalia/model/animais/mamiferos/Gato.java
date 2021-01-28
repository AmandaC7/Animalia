package animalia.model.animais.mamiferos;

import animalia.interfaces.membros.Quadrupede;
import animalia.model.animais.Mamifero;

public class Gato extends Mamifero implements Quadrupede{

	
	public Gato(String nome, String cor, String alimentacao, String habitat) {
		super(nome, cor, alimentacao, habitat);
	}

	@Override
	public void amamentar() {

		System.out.println("Eu amamento");
		
	}

	@Override
	public void emitirSom() {

		System.out.println("Miaw me dê comida humano insolente!");
	}

	@Override
	public void quadrupede() {
		System.out.println("Eu ando com quatro patas, mas só quando você está olhando.. Q? nada");

		
	}

}
