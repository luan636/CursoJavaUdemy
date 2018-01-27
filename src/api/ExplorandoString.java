package api;

public class ExplorandoString {

	public static void main(String[] args) {
		String nome = new String("Leonardo");
		nome = "Leo" + "nardo";
		
		//Alguns m�todos
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.substring(0, 3));
		System.out.println(nome.indexOf('d'));
		System.out.println(nome.charAt(6));
		System.out.println(nome.equalsIgnoreCase("leonardo"));
		System.out.println(nome.startsWith("Leo"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.concat(" � legal").concat("!"));
		
		// A string � imutavel
		System.out.println(nome); //Apesar de termos executado varios metodos, ela continua igual.
		
		nome = nome.toUpperCase().substring(0, 3).concat(" � legal"); //So mudou pois o resultado do metodos foi atribuido � variavel.
		System.out.println(nome);
	}
}
