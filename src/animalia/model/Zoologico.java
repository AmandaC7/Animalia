package animalia.model;

import java.util.List;

public class Zoologico {

	private String nome;
	private List<Sessao> sessoes;
	private Ingresso ingresso;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Sessao> getSessoes() {
		return sessoes;
	}
	public void setSessoes(List<Sessao> sessoes) {
		this.sessoes = sessoes;
	}


	
}
