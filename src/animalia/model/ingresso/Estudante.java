package animalia.model.ingresso;

import animalia.interfaces.IngressoInterface;
import animalia.model.Ingresso;

public class Estudante implements IngressoInterface{

	public double valorIngresso(double valor) {
		Ingresso ingresso = new Ingresso();
		ingresso.getValor();
		ingresso.setValor(valor - 0.50);
		return (valor);
	}
}
