package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		Set<String> aprovados = new TreeSet<>(); 
		/*
		 * Tipos de conjuntos diferentes:
		 * HashSet = Não respeita nenhuma ordenação.
		 * TreeSet = Ordem alfabetica. Ou numerica, se for o caso.
		 * LinkedHashSet = Ordem de inserção 
		 */
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		
	}
}
