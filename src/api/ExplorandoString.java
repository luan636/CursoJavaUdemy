package api;

public class ExplorandoString {

	public static void main(String[] args) {
		String nome = new String("Leonardo");
		nome = "Leo" + "nardo";
		
		//Alguns métodos
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.substring(0, 3));
		System.out.println(nome.indexOf('d'));
		System.out.println(nome.charAt(6));
		System.out.println(nome.equalsIgnoreCase("leonardo"));
		System.out.println(nome.startsWith("Leo"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.concat(" é legal").concat("!"));
		
		// A string é imutavel
		System.out.println(nome); //Apesar de termos executado varios metodos, ela continua igual.
		
		nome = nome.toUpperCase().substring(0, 3).concat(" é legal"); //So mudou pois o resultado do metodos foi atribuido à variavel.
		System.out.println(nome);
	}
}
