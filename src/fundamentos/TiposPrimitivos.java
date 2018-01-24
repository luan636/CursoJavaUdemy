package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Tipo primitivo booleano
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf("%b %b\n", bo1, bo2);
		
		// Tipo primtivo caracter (Cada caracter um inteiro associado)
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050';
		System.out.printf("%c %c %c\n", c1, c2, c3);
		
		// tipo primitivo inteiro (Em todas as variaveis foram colocados o maior valor suportado).
		byte b = 127;
		short s = 32767;
		int i = 2_147_483_647; /*Os undelines não interferem no codigo,
		apenas server para deixar o numero mais legivel*/
		long l = 9_223_372_036_854_775_807L;
		System.out.printf("%d\n%d\n%d\n%d", b, s, i, l);
		System.out.println("\n");
		
		//Imprimir uma variavel em binario (Somente demonstrando que os valores dobram em bytes)
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(s));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Long.toBinaryString(l));
		System.out.println("\n");
		
		// Tipos primitivos reais (Ponto flutuante)
		float f = 3.1416f; //Quando usamos tipo float, tem que colocar o f no final do conteudo.
		double d = 2.45;
		System.out.printf("%.2f\n%f", f, d); //Para escolher quantas casas decimais queremos tem que colocar o %.nf, onde n representa o numero de casas decimais.
		
	}
}
