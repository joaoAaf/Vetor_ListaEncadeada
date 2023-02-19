package atividadeParcialED;

public class Lista {

	private No primeiro;
	private No ultimo;

	/*public No getInicio() {
		return primeiro;
	}

	public void setInicio(No inicio) {
		this.primeiro = inicio;
	}

	public No getFim() {
		return ultimo;
	}

	public void setFim(No fim) {
		this.ultimo = fim;
	}*/
	
	public boolean vazia(Lista lista) {
		if (lista.primeiro == null && lista.ultimo == null) {
			return true;
		}
		else {
			return false;
		}
	}

}
