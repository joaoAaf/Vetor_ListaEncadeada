package atividadeParcialED;

public class Lista {

	private No inicio;
	private No fim;

	/*
	 * public No getInicio() { return primeiro; }
	 * 
	 * public void setInicio(No inicio) { this.primeiro = inicio; }
	 * 
	 * public No getFim() { return ultimo; }
	 * 
	 * public void setFim(No fim) { this.ultimo = fim; }
	 */

	public boolean vazia() {
		return inicio == null;
	}

	/*
	 * public void inserirInicio(int dado) { if (vazia()) { primeiro = ultimo = new
	 * No(dado); } else { primeiro = new No(dado,primeiro); } }
	 */

	public void inserir(int dado) {
		No no = new No(inicio, null, dado);
		if (vazia()) {
			inicio = fim = no;
		} else {
			fim.setProximo(no);
			fim = no;
		}
	}

	public void exibir() {
		No aux;
		aux = inicio;
		while (aux != null) {
			System.out.println(aux.getDado());
			aux = aux.getProximo();
		}
	}

	public int pesquisar(int dado) {
		No no = inicio;
		while (no != null && no.getDado() != dado) {
			no = no.getProximo();
		}
		if (no != null && no.getDado() == dado) {
			return no.getDado();
		} else {
			return -1;
		}
	}
	
	public int excluir(int dado) {
		 
		return -1;
	}

}
