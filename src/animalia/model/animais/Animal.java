package animalia.model.animais;

public abstract class Animal {

	private String nome;
	private String cor;
	private String alimentacao;
	private String habitat;
	

	public Animal(String nome, String cor, String alimentacao, String habitat) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.alimentacao = alimentacao;
		this.habitat = habitat;
	}


	public abstract void emitirSom();
	
	
	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	
	public String getAlimentacao() {
		return alimentacao;
	}
	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	
	
	
	
	
	
}
