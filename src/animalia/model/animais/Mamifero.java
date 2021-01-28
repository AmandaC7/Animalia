package animalia.model.animais;

public abstract class Mamifero extends Animal {
		
	private final String classe = "Mamifero";
	
	public Mamifero(String nome, String cor, String alimentacao, String habitat) {
		super(nome, cor, alimentacao, habitat);
	}

	public abstract void amamentar();

	public String getClasse() {
		return classe;
	}

	
}
