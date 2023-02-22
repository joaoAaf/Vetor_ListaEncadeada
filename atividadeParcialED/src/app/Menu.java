package app;

import vetor.*;
import java.util.Scanner;

public class Menu {

	Scanner leia = new Scanner(System.in);

	public void menuVetor() {

		int op = -1;
		int[] v = new int[5];
		Vetor vetor = new Vetor(v);

		while (op != 5) {
			System.out.println("\n-----------------------");
			System.out.println("|        Vetor        |");
			System.out.println("-----------------------");
			System.out.println("| 1 - Inserir dado    |");
			System.out.println("| 2 - Alterar dado    |");
			System.out.println("| 3 - Pesquisar dado  |");
			System.out.println("| 4 - Mostrar dados   |");
			System.out.println("| 5 - Voltar          |");
			System.out.println("----------------------");
			System.out.println("Selecione a opção desejada:");

			op = leia.nextInt();
			int dado;
			int posicao;

			switch (op) {

			case 1:

				System.out.println("Digite os 5 números inteiros para preencher o vetor:\n");
				for (int i = 0; i < v.length; i++) {
					System.out.println("Digite o " + (i + 1) + "º número:");
					dado = leia.nextInt();
					vetor.addDado(dado, i);
				}
				break;

			case 2:
				vetor.mostraVetor(v);
				System.out.println("Digite a posição do número a ser alterado:");
				posicao = leia.nextInt();
				System.out.println("Digite o número que irá substituí-lo:");
				dado = leia.nextInt();
				vetor.alteraDado(posicao, dado);
				break;

			case 3:
				System.out.println("Informe o número que deseja pesquisar:");
				dado = leia.nextInt();
				vetor.pesquisaDado(v, dado);
				break;

			case 4:
				vetor.mostraVetor(v);
				break;

			case 5:
				break;

			default:
				System.out.println("Digite um número de 1 a 5:");

			}
		}
	}
}
