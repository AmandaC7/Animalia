package animalia.model.animais;

public abstract class Inseto extends Animal {

	private final int quantidadePernas = 6;
	
	public Inseto(String nome, String cor, String alimentacao, String habitat) {
		super(nome, cor, alimentacao, habitat);
	}

	public int getQuantidadePernas() {
		return quantidadePernas;
	}
	

}
