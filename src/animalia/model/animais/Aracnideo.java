package animalia.model.animais;

public abstract class Aracnideo extends Animal{

	public Aracnideo(String nome, String cor, String alimentacao, String habitat) {
		super(nome, cor, alimentacao, habitat);
	}


	private final int quantidadePernas = 8;
	
	
	public int getQuantidadePernas() {
		return quantidadePernas;
	}

	

}
