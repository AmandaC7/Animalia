package animalia;

import java.util.ArrayList;
import java.util.List;

import animalia.model.Cliente;
import animalia.model.Ingresso;
import animalia.model.Sessao;
import animalia.model.Zoologico;
import animalia.model.animais.Animal;
import animalia.model.animais.Ave;
import animalia.model.animais.aves.Papagaio;
import animalia.model.animais.aves.Pinguin;
import animalia.model.animais.mamiferos.Gato;
import animalia.model.animais.mamiferos.Ornitorrinco;
import animalia.service.enums.TipoIngresso;
import animalia.service.enums.TipoSessao;

public class Main {

	public static void main(String[] args) {

//		ANIMAIS
		
		Ornitorrinco jerry = new Ornitorrinco("Jerry", "Marrom", "carnívoro","Austrália" );
		jerry.emitirSom();
		jerry.amamentar();
		jerry.quadrupede();
		
		Gato buffy = new Gato("Buffy","Marrom, preto e branco", "carnívoro", "global");
		buffy.emitirSom();
		
		Papagaio papagaio = new Papagaio("Loro","verde", "sementes", "Floresta");
		papagaio.emitirSom();
		papagaio.voar();
		
		Pinguin pinguin = new Pinguin("Pingu", "Preto e branco","peixe", "gelo");
		pinguin.emitirSom();
		pinguin.voar();
		
//		ZOOLOGICOS
		
		Zoologico zoologico = new Zoologico();
		zoologico.setNome("Animalia");
		
//		INGRESSOS

		Ingresso ingresso = new Ingresso();
		ingresso.setValor(50);
		ingresso.setTipo(TipoIngresso.NORMAL);
		ingresso.valorIngresso(ingresso.getTipo());
		System.out.println(ingresso.getValor());

		
//		Ingresso ingresso2 = new Ingresso();
//		ingresso2.setValor(50);
//		ingresso2.setTipo(TipoIngresso.CRIANCA);
//		ingresso2.valorIngresso(ingresso2.getTipo());
//		System.out.println(ingresso2.getValor());
//		

//		SESSOES
		
		Sessao<Ave> aves = new Sessao<Ave>();
//		aves.setSessao(TipoSessao.AVE);
		aves.addAnimal(papagaio);
		aves.addAnimal(pinguin);
		
		List<Animal> mamiferos = new ArrayList<Animal>();
		mamiferos.add(jerry);
			
//		CLIENTES
		
		Cliente cliente = new Cliente();
		cliente.setEstudante(true);
		cliente.setNome("Lucas");
		cliente.setIngresso(ingresso);
		cliente.validacaoEstudante();
		cliente.setIdade(28);	
		System.out.println(cliente.getIngresso().getTipo());

		Cliente cliente2 = new Cliente();
		cliente2.setEstudante(false);
		cliente2.setNome("Lucas");
		cliente2.setIngresso(ingresso);
		cliente2.validacaoEstudante();
		cliente2.validacaoIdade();
		cliente2.setIdade(11);
		System.out.println(cliente2.getIngresso().getTipo());

		
	}

}
