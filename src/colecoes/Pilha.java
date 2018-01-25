package colecoes;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>(); //Ultimo a entrar é o primeiro a sair.
		//Deque<String> pilha = new ArrayDeque<>(); //O Deque implementa as funcionalidades/metodo da pilha e da fila.
		
		pilha.push("O Pequeno Príncipe");
		pilha.push("O Hobbit");
		pilha.push("Don Quixote");
		
		System.out.println("peek..." + pilha.peek()); //So consulta a pilha e retorna o que foi adicionado por ultimo.
		System.out.println("pop..." + pilha.pop()); //Retorna e retira.
		System.out.println("pop..." + pilha.pop());
		System.out.println("pop..." + pilha.pop()); //Se não tiver mais elementos na pilha, o pop da erro.
	
	}
}
