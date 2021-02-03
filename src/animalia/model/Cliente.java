package animalia.model;

import animalia.service.enums.TipoIngresso;

public class Cliente {

	private String nome;
	private int idade;
	private Ingresso ingresso;	
	private boolean isEstudante;
	
	public void validacaoIdade() {
		if(getIdade() > 59) {
			ingresso.setTipo(TipoIngresso.IDOSO);
		}else if(getIdade() < 12) {
			ingresso.setTipo(TipoIngresso.CRIANCA);
		}
	}
	
	public void validacaoEstudante() {
		if(isEstudante == true) {
			ingresso.setTipo(TipoIngresso.ESTUDANTE);
		}else {
			ingresso.setTipo(TipoIngresso.NORMAL);
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Ingresso getIngresso() {
		return ingresso;
	}
	public void setIngresso(Ingresso ingresso) {
		this.ingresso = ingresso;
	}
	public boolean isEstudante() {
		return isEstudante;
	}
	public void setEstudante(boolean isEstudante) {
		this.isEstudante = isEstudante;
	}
	
	
	
	
	
	
}
