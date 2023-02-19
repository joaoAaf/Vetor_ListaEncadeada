package atividadeParcialED;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao = -1;
		
		while (opcao != 3) {
			System.out.println("------------------");
			System.out.println("| 1 - Vetor      |");
			System.out.println("| 2 - Lista      |");
			System.out.println("| 3 - Sair       |");
			System.out.println("------------------");
			System.out.println("Selecione a opção desejada:");
		
			opcao = leia.nextInt();
			
			if (opcao == 1) {
				int[] v1 = new int[5];
				Vetor vetor = new Vetor(v1);
				vetor.menuVetor();
			}
			
			}
		
		leia.close();
		
		}

}
