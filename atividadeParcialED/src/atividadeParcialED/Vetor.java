package atividadeParcialED;

import java.util.Scanner;

public class Vetor {

	private int[] vetor;

	public Vetor(int[] vetor) {
		super();
		this.vetor = vetor;
	}

	Scanner leia = new Scanner(System.in);

	public void inserirDado(int quant) {
		for (int i = 0; i < quant; i++) {
			System.out.println("Digite o " + (i + 1) + "º dado:");
			vetor[i] = leia.nextInt();
		}
	}

	public void alterarDado() {
		mostrarDados(vetor);
		System.out.println("Digite a posição do número a ser alterado:");
		int posicao = leia.nextInt();
		System.out.println("Digite o número que irá substituí-lo:");
		int dado = leia.nextInt();
		if (posicao >= 0 || posicao < vetor.length) {
			vetor[posicao] = dado;
		} else {
			System.out.println("A posição " + posicao + " não existe.");
		}

	}

	public int pesquisarDado(int[] vetor) {
		System.out.println("Informe o número que deseja pesquisar:");
		int dado = leia.nextInt();
		int posicao = -1;
		for (int i = 0; i < vetor.length; i++) {
			if (dado == vetor[i]) {
				System.out.println("O número está na posição " + i);
				posicao = i;
				break;
			} else if (i == vetor.length - 1) {
				System.out.println("O número não está no vetor.");
				posicao = -1;
			}
		}
		return posicao;
	}

	public void mostrarDados(int[] vetor) {
		System.out.println("Vetor:\n");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Posição " + i + " = " + vetor[i]+"\n");
		}
	}

	public void menuVetor() {

		int opcao = -1;

		while (opcao != 5) {
			System.out.println("-----------------------");
			System.out.println("|        Vetor        |");
			System.out.println("-----------------------");
			System.out.println("| 1 - Inserir dado    |");
			System.out.println("| 2 - Alterar dado    |");
			System.out.println("| 3 - Pesquisar dado  |");
			System.out.println("| 4 - Mostrar dados   |");
			System.out.println("| 5 - Voltar          |");
			System.out.println("----------------------");
			System.out.println("Selecione a opção desejada:");
			
			opcao = leia.nextInt();

			if (opcao == 1) {
				System.out.println("Digite os 5 valores do vetor:\n");
				inserirDado(vetor.length);
			}

			if (opcao == 2) {
				alterarDado();
			}

			if (opcao == 3) {
				pesquisarDado(vetor);
			}

			if (opcao == 4) {
				mostrarDados(vetor);
			}

		}

	}

}
