package menu;

import java.util.Scanner;

public class MenuPrincipal {

	Scanner leia = new Scanner(System.in);

	public void menuPrincipal() {

		int op = -1;
		MenusInternos mi = new MenusInternos();

		while (op != 3) {
			System.out.println("\n-----------------------");
			System.out.println("| 1 - Vetor           |");
			System.out.println("| 2 - Lista           |");
			System.out.println("| 3 - Sair            |");
			System.out.println("----------------------");
			System.out.println("Selecione a opção desejada:");

			op = leia.nextInt();

			switch (op) {

			case 1:
				mi.menuVetor();
				break;

			case 2:
				mi.menuLista();
				break;

			case 3:
				break;

			default:
				System.out.println("Digite um número de 1 a 3:");

			}
		}
	}
}