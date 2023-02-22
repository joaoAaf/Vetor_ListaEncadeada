package lista;

public class Lista {

	private No inicio;
	private No fim;

	public boolean temNada() {
		return inicio == null;
	}

	public Integer definePosicao() {
		Integer posicao;
		if (temNada()) {
			return null;
		} else {
			posicao = fim.getPosicao() + 1;
			return posicao;
		}
	}

	public void addDado(int dado) {
		No n = new No(dado);
		if (temNada()) {
			inicio = fim = n;
			n.setPosicao(0);
		} else {
			n.setPosicao(definePosicao());
			n.setAnterior(fim);
			fim.setProximo(n);
			fim = n;
		}
	}

	public void mostraLista() {
		No n;
		n = inicio;
		System.out.println("\nLista:\n");
		while (n != null) {
			System.out.println("Posição " + n.getPosicao() + ": " + n.getDado());
			n = n.getProximo();
		}
	}

	public int pesquisaDado(int dado) {
		No n = inicio;
		while (n != null && n.getDado() != dado) {
			n = n.getProximo();
		}
		if (n != null && n.getDado() == dado) {
			return n.getDado();
		} else {
			return -1;
		}
	}

	public No pesquisaPosicao(Integer posicao) {
		No n = inicio;
		while (n != null && n.getPosicao() != posicao) {
			n = n.getProximo();
		}
		if (n != null && n.getPosicao() == posicao) {
			return n;
		} else {
			return null;
		}
	}

	public void corrigePosicoes() {
		No n;
		n = inicio;
		Integer cont = 0;
		while (n != null) {
			n.setPosicao(cont);
			cont += 1;
			n = n.getProximo();
		}
	}

	public void excluiDado(Integer posicao) {
		No n;
		n = pesquisaPosicao(posicao);
		if (n != null) {
			if (inicio != fim) {
				if (n == inicio) {
					inicio = n.getProximo();
					n.getProximo().setAnterior(null);
					corrigePosicoes();
				} else if (n == fim) {
					fim = n.getAnterior();
					n.getAnterior().setProximo(null);
				} else {
					n.getAnterior().setProximo(n.getProximo());
					n.getProximo().setAnterior(n.getAnterior());
					corrigePosicoes();
				}
			} else {
				inicio = null;
				fim = null;
			}
		} else {
			System.out.println("Esta posição não existe.");
		}
	}

	public void alteraDado(Integer posicao, int dado) {
		No n;
		n = pesquisaPosicao(posicao);
		if (temNada()) {
			System.out.println("A lista está vazia");
		} else if (n == null) {
			System.out.println("Esta posição não existe.");
		} else {
			n.setDado(dado);
		}
	}
}