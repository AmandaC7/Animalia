package animalia.service.enums;

import animalia.interfaces.IngressoInterface;
import animalia.model.ingresso.Estudante;
import animalia.model.ingresso.Normal;

public enum TipoIngresso {

	NORMAL {
		@Override
		public IngressoInterface obterIngresso() {
			return new Normal();
		}
	}, ESTUDANTE {
		@Override
		public IngressoInterface obterIngresso() {
			return new Estudante();
		}
	}, CRIANCA {
		@Override
		public IngressoInterface obterIngresso() {
			return null;
		}
	}, IDOSO {
		@Override
		public IngressoInterface obterIngresso() {
			return null;
		}
	};
	
	public abstract IngressoInterface obterIngresso();
}
