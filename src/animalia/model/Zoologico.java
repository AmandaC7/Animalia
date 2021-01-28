package animalia.model;

import java.util.List;

public class Zoologico {

	private String nome;
	private List<Sessao> sessoes;
	private double ingresso;
	private int quantidadeIngresso;
	
	
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
	public double getIngresso() {
		return ingresso;
	}
	public void setIngresso(double ingresso) {
		this.ingresso = ingresso;
	}
	public int getQuantidadeIngresso() {
		return quantidadeIngresso;
	}
	public void setQuantidadeIngresso(int quantidadeIngresso) {
		this.quantidadeIngresso = quantidadeIngresso;
	}
	
	
	
	
}
