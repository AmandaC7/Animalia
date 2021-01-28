package animalia;

import java.util.ArrayList;
import java.util.List;

import animalia.model.Sessao;
import animalia.model.Zoologico;
import animalia.model.animais.Animal;
import animalia.model.animais.mamiferos.Gato;
import animalia.model.animais.mamiferos.Ornitorrinco;

public class Main {

	public static void main(String[] args) {

		Animal jerry = new Ornitorrinco("Jerry", "Marrom", "carnívoro","Austrália" );
		jerry.emitirSom();
		
		
		Animal buffy = new Gato("Buffy","Marrom, preto e branco", "carnívoro", "global");
		buffy.emitirSom();
		
		Zoologico zoologico = new Zoologico();
		zoologico.setNome("Animalia");
		zoologico.setIngresso(25);
		zoologico.setQuantidadeIngresso(50);
		
		List<Animal> mamiferos = new ArrayList<Animal>();
		mamiferos.add(jerry);
		mamiferos.add(jerry);
		Sessao sessao = new Sessao();
		sessao.setSessao(mamiferos);
		
		List<Sessao> mamifero = new ArrayList<Sessao>();
		
		
	}

}
