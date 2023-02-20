package atividadeParcialED;

public class No {

	private int dado;
	private No anterior;
	private No proximo;
	private Integer posicao;

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

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

}
