package classe;

public class VariaveisLocais {
	/* Quando queremos acessar uma variavel, o java sempre vai buscar a varivel de escopo mais especifico
	 * Ou seja, se existe um a variavel 'a' que é global e uma variavel 'a' que é local,
	 * o java vai buscar por padrão a variavel local.
	 * para referenciar para a variavel global, devemos colocar a palavra reservada 'this', ex: 'this.a'
	 */
	int a = 2; // As variveis de instancia podem ser declarades antes ou depois do metodos, podendo ser usadas dentro do metodo em qualquer das circuntancias.
	
	void teste1() {
		int a1 = 2; // A variavel criada dentro do metodo, so pode ser usada dentro do metodo. Ou seja ela é local.
		System.out.println(a);
		System.out.println(a1);
		
		if(a1 > 3) {
			int a2 = 3;
			System.out.println(a2);
		}
	}
		
	void teste2() {
		int a1 = 7; //Esta variavel tem o mesmo nome da variavel usada no metodo 'teste1', mas como são locais, uma não interfere na outra.
		System.out.println(a1);
	}
}

