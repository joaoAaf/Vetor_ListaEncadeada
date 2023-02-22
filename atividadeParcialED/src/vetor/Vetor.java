package vetor;

public class Vetor {

	private int[] vetor;

	public Vetor(int[] vetor) {
		this.vetor = vetor;
	}

	public void addDado(int dado, int posicao) {
		vetor[posicao] = dado;
	}

	public void alteraDado(int posicao, int dado) {
		if (posicao >= 0 && posicao < vetor.length) {
			vetor[posicao] = dado;
		} else {
			System.out.println("A posição " + posicao + " não existe.");
		}

	}

	public int pesquisaDado(int[] vetor, int dado) {
		int posicao = -1;
		for (int i = 0; i < vetor.length; i++) {
			if (dado == vetor[i]) {
				System.out.println("O número está na posição " + i);
				posicao = i;
				break;
			} else if (i == vetor.length - 1) {
				System.out.println("O número não está no vetor.");
			}
		}
		return posicao;
	}

	public void mostraVetor(int[] vetor) {
		System.out.println("\nVetor:\n");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Posição " + i + ": " + vetor[i]);
		}
	}
}