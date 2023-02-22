package lista;

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
		No no;
		no = inicio;
		while (no != null) {
			System.out.println("Posição " + no.getPosicao() + " = " + no.getDado());
			no = no.getProximo();
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

	public void corrigirPosicoes() {
			No no;
			no = inicio;
			Integer cont = 0;
			while (no != null) {
				no.setPosicao(cont);
				cont += 1;
				no = no.getProximo();
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
					corrigirPosicoes();
				} else if (no == fim) {
					fim = no.getAnterior();
					no.getAnterior().setProximo(null);
				} else {
					no.getAnterior().setProximo(no.getProximo());
					no.getProximo().setAnterior(no.getAnterior());
					corrigirPosicoes();
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
		} else if (no == null) {
			System.out.println("Este item não está na lista.");
		} else {
			no.setDado(novoDado);
		}
	}
}
