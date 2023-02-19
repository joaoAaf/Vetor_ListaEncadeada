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
}
