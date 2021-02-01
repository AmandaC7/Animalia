package animalia;

import java.util.ArrayList;
import java.util.List;

import animalia.interfaces.IngressoInterface;
import animalia.model.Ingresso;
import animalia.model.Zoologico;
import animalia.model.animais.Animal;
import animalia.model.animais.mamiferos.Gato;
import animalia.model.animais.mamiferos.Ornitorrinco;
import animalia.service.enums.TipoIngresso;

public class Main {

	public static void main(String[] args) {

		Animal jerry = new Ornitorrinco("Jerry", "Marrom", "carnívoro","Austrália" );
		jerry.emitirSom();
		
		
		Animal buffy = new Gato("Buffy","Marrom, preto e branco", "carnívoro", "global");
		buffy.emitirSom();
		
		Zoologico zoologico = new Zoologico();
		zoologico.setNome("Animalia");
//		Ingresso ingresso = new Ingresso();
//		ingresso.setValor(50);
//		ingresso.setTipo(TipoIngresso.NORMAL);
//		ingresso.valorIngresso(ingresso.getTipo());
//		System.out.println(ingresso.getValor());
//
//		
//		Ingresso ingresso2 = new Ingresso();
//		ingresso2.setValor(50);
//		ingresso2.setTipo(TipoIngresso.CRIANCA);
//		ingresso2.valorIngresso(ingresso2.getTipo());
//		System.out.println(ingresso2.getValor());
		
		Ingresso ingresso = new Ingresso();
		ingresso.setValor(50);
		ingresso.setTipo(TipoIngresso.NORMAL);
		ingresso.valorIngresso(ingresso.getValor());
		System.out.println(ingresso.getValor());
		
		Ingresso ingresso2 = new Ingresso();
		ingresso2.setValor(50);
		ingresso2.setTipo(TipoIngresso.ESTUDANTE);
		IngressoInterface ingressoInterface = ingresso2.getTipo().obterIngresso();
		ingresso2.valorIngresso(ingresso2.getValor());
		System.out.println(ingresso2.getValor());

		
		List<Animal> mamiferos = new ArrayList<Animal>();
		mamiferos.add(jerry);
		mamiferos.add(jerry);
				
		
	}

}
