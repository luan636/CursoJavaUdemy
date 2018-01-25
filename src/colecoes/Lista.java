package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	/* Conceitos:
	 * - Por padrão, é ordenado por ordem de registro.
	 * - Suporta 2 ou mais elementros iguais.	 * 
	 * 
	 */
	public static void main(String[] args) {
		List<String> aprovados = new ArrayList<String>();
		aprovados.add("Joao");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		System.out.println("get...\n" + aprovados.get(1));
		
		System.out.println("Add...\n" + aprovados.add("Maria\n") + "Size...\n" + aprovados.size());
		
		System.out.println("Remove...\n" + aprovados.remove("maria"));
		System.out.println(aprovados.remove("Maria")); //O metodo remove a primeira Maria adicionada.
		System.out.println("Size...\n" + aprovados.size() + "\n");
	
		for(String nome: aprovados) {
			System.out.println(nome);
		}
	}
}
