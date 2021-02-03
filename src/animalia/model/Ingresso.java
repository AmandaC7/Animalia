package animalia.model;

import animalia.service.enums.TipoIngresso;

public class Ingresso {

	private double valor;
	private TipoIngresso tipo;
	private int quantidade;

	public void valorIngresso(TipoIngresso tipo) {
		if(tipo == TipoIngresso.NORMAL) {
			setValor(valor);
		}else if(tipo == TipoIngresso.ESTUDANTE) {
			setValor(valor - 0.50);
		}else if (tipo == TipoIngresso.CRIANCA) {
			setValor(0);
		}else if (tipo == TipoIngresso.IDOSO) {
			setValor(valor - 0.25);
		}
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public TipoIngresso getTipo() {
		return tipo;
	}

	public void setTipo(TipoIngresso tipo) {
		this.tipo = tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
