package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.offer("Maria"); // O metodo offer, retorna sempre verdadeiro ou falso pra mostrar se conseguiu ou n�o adicionar o elemento na fila.
		fila.offer("Jo�o");
		fila.add("Pedro"); // Se o metodo adicionar n�o conseguir adicionar o elemento na fila, ele vai retornar um erro.
		
		//Metodos de consulta:
		System.out.println("Peek/Element...\n" + fila.peek()); //Em uma fila sem elemento. Peek: informa que a fila esta vazia. Element: Da erro.
		System.out.println(fila.element()); // O Peek e o Element, n�o removem o elemento da fila, apenas consultam.
		
		//Metodos de remo��o: 
		System.out.println("Poll...\n" + fila.poll()); //Pool: remove o elemento e retorna o elemento removido. Se estiver vazio, ele retorno null.
		System.out.println("Remove...\n" + fila.remove()); //Remove: faz igual o pool, mas se a fila estiver fazia ele da erro.
		System.out.println("Poll...\n" + fila.poll());
		System.out.println("Poll...\n" + fila.poll()); //Ja n�o h� mais elementos na fila, ent�o ele vai retornar null. Neste caso o remove daria erro.
		
	}
}
