package atividadeParcialED;

public class No {

	private int dado;
	private No anterior;
	private No proximo;

	public No() {
		
	}
	
	public No(No anterior, No proximo, int dado) {
		this.dado = dado;
		this.anterior = anterior;
		this.proximo = proximo;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}
	
	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

}
