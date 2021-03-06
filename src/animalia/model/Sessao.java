package animalia.model;

import java.util.List;

import animalia.service.enums.TipoSessao;

public class Sessao<T> {

	private String nome;
	private final TipoSessao sessao;
	private final List<T> animais;

	public Sessao(String nome, TipoSessao sessao, List<T> animais) {
		super();
		this.nome = nome;
		this.sessao = sessao;
		this.animais = animais;
	}

	public List<T> getAnimais() {
		return animais;
	}

	public void addAnimal(T t) {
		animais.add(t);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoSessao getSessao() {
		return sessao;
	}

	public void setSessao(TipoSessao sessao) {
		this.sessao = sessao;
	}

}
