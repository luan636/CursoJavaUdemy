package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		Set<String> aprovados = new TreeSet<>(); 
		/*
		 * Tipos de conjuntos diferentes:
		 * HashSet = N�o respeita nenhuma ordena��o.
		 * TreeSet = Ordem alfabetica. Ou numerica, se for o caso.
		 * LinkedHashSet = Ordem de inser��o 
		 */
		aprovados.add("Jo�o");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		
	}
}
