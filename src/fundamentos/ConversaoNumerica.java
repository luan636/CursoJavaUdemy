package fundamentos;

public class ConversaoNumerica {

	public static void main(String[] args) {
		// Exemplo 1 - Convers�o explicita
		float f = (float) 0.1;
		System.out.println(f);
		
		// Exemplo 2 - convers�o explicita
		int i1 = (int) 7.9;
		System.out.println(i1);
		
		// Exemplo 3 - Convers�o implicita
		int i2 = 'a';
		System.out.println(i2);
		
		// Exemplo 4 - Convers�o implicita
		double d = 1001;
		System.out.println(d);
	}
}
