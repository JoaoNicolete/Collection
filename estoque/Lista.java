package estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		int option = 0;

		ArrayList<String> estoque = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);

		System.out.println("Indique a opção desejada:");
		System.out.println("1. Adicionar item no estoque.");
		System.out.println("2. Remover item no estoque.");
		System.out.println("3. Atualizar item no estoque.");
		System.out.println("4. Mostrar estoque.");
		System.out.println("4. Sair do programa.");
		option = ler.nextInt();

		switch (option) {

		case (1):
			
			System.out.println("Insira o item:");
			String produtos = ler.nextLine();
			estoque.add(produtos);
		
			break;

		case (2):
			System.out.println("Indique o item que deseja remover da lista");
			estoque.remove(ler.nextLine());
			break;

		case (3):

			System.out.println("Indique número do item que deseja atualizar");
			int num = ler.nextInt();
			
			System.out.println("Indique o novo produto: ");
			String produto = ler.nextLine();
			estoque.set(num + 1, produto);

		case (4):
			for (int i = 0; i < estoque.size(); i++) {
				System.out.println("O estoque completo é: ");
				System.out.println(estoque.get(i));
			}

		default:
			System.out.println("Opção não reconhecida.");

		}

		ler.close();
	}
}
