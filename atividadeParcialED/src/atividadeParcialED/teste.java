package atividadeParcialED;

public class teste {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		
		lista.inserir(5);
		lista.inserir(6);
		lista.inserir(7);
		lista.inserir(10);
		lista.inserir(4);
		
		lista.exibir();
		System.out.println();
		System.out.println(lista.pesquisar(9));
		System.out.println(lista.pesquisar(10));
		lista.excluir(4);
		System.out.println();
		lista.exibir();
	}

}
