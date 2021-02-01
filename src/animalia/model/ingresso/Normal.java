package animalia.model.ingresso;

import animalia.interfaces.IngressoInterface;
import animalia.model.Ingresso;

public class Normal implements IngressoInterface{

	public double valorIngresso(double valor) {
		Ingresso ingresso = new Ingresso();
		ingresso.getValor();
		ingresso.setValor(valor);
		return valor;
	}



}
