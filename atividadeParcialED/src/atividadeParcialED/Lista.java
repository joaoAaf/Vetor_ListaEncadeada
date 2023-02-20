package atividadeParcialED;

public class Lista {

	private No inicio;
	private No fim;

	public boolean vazia() {
		return inicio == null;
	}

	public Integer definePosicao() {
		Integer posicao;
		if (vazia()) {
			return null;
		} else {
			posicao = fim.getPosicao() + 1;
			return posicao;
		}

	}

	public void inserir(int dado) {
		No no = new No(dado);
		if (vazia()) {
			inicio = fim = no;
			no.setPosicao(0);
		} else {
			no.setPosicao(definePosicao());
			no.setAnterior(fim);
			fim.setProximo(no);
			fim = no;
		}
	}

	public void mostrar() {
		No aux;
		aux = inicio;
		while (aux != null) {
			System.out.println("Posição " + aux.getPosicao() + " = " + aux.getDado());
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

	public No pesquisarPosicao(Integer posicao) {
		No no = inicio;
		while (no != null && no.getPosicao() != posicao) {
			no = no.getProximo();
		}
		if (no != null && no.getPosicao() == posicao) {
			return no;
		} else {
			return null;
		}
	}

	public void excluir(Integer posicao) {
		No no;
		no = pesquisarPosicao(posicao);
		if (no != null) {
			if (inicio != fim) {
				if (no == inicio) {
					inicio = no.getProximo();
					no.getProximo().setAnterior(null);
				} else if (no == fim) {
					fim = no.getAnterior();
					no.getAnterior().setProximo(null);
				} else {
					no.getAnterior().setProximo(no.getProximo());
					no.getProximo().setAnterior(no.getAnterior());
				}
			} else {
				inicio = null;
				fim = null;
			}
		} else {
			System.out.println("Esta posição não existe.");
		}
	}
	
	public void alterar(Integer posicao, int novoDado) {
		No no;
		no = pesquisarPosicao(posicao);
		if (vazia()) {
			System.out.println("A lista está vazia");
		}
		else if (no == null) {
			System.out.println("Este item não está na lista.");
		}
		else {
			no.setDado(novoDado);
		}
	}

}
