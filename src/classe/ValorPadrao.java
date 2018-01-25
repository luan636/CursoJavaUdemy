package classe;

public class ValorPadrao {

	static String a; //Esta variavel tem o valor padrão igual à zero.
	//Somente as variaveis de classe e variaiveis de instancia recebem valores padrões.
	
	public static void main(String[] args) {
		System.out.println(a);
		
		int b = 0; //As variaveis locais precisam ter valores definidos. (Ou seja, ela precisa ser inicializada)
		System.out.println(b);
		
		
	}
}
