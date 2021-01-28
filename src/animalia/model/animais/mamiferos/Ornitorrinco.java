package animalia.model.animais.mamiferos;

import animalia.interfaces.membros.Quadrupede;
import animalia.interfaces.reproducao.Oviparo;
import animalia.model.animais.Mamifero;

public class Ornitorrinco extends Mamifero implements Oviparo, Quadrupede {

	public Ornitorrinco(String nome, String cor, String alimentacao, String habitat) {
		super(nome, cor, alimentacao, habitat);
	}

	@Override
	public void oviparo() {

		System.out.println("Sim, eu boto ovo. Sim, eu sou um animal bem peculiar!");
		
	}

	@Override
	public void amamentar() {

		System.out.println("Sim, eu amamento mesmo botando ovo kk Porém não tenho mama, só glândulas mamárias");
		
	}

	@Override
	public void emitirSom() {

		System.out.println("Barulho de ornitorrinco inserted");
		
	}

	@Override
	public void quadrupede() {

		System.out.println("Eu ando em quatro patas!");
	}


}
