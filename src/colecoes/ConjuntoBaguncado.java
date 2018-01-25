package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		Set conjunto = new HashSet();
		conjunto.add('a');
		conjunto.add("Texto");
		conjunto.add(1);
		conjunto.add(3.14);
		conjunto.add(false);
		
		System.out.println("add...");
		System.out.println(conjunto.add(1));
		System.out.println(conjunto.add(10));
		System.out.println("size... "+ conjunto.size()); //Metodo que faz a contagem de elementos que a collection possui.
		System.out.println(conjunto.remove('a')); // Metodo que remove um elemento. 
		System.out.println("size... "+ conjunto.size());
		
		System.out.println("Contains...");
		System.out.println(conjunto.contains('a')); // Metodo que verifica se um certo elemento esta contido.
		System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		// conjunto.addAll(nums);; //addAll, adiconado todos os elementos de um conjunto no outro (União).
		conjunto.retainAll(nums);
		
		System.out.println("Size..." + conjunto.size());
		
		conjunto.clear(); // Limpa a collection
		System.out.println(conjunto.isEmpty()); // Diz se collection esta vazia ou não. 
	}
}
