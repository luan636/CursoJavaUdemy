package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia ?".toUpperCase().replace("?", "Bia").concat("!");
		System.out.println(s);
		
		//Poderia tambem ser escrito dessa forma:
		String a = "Bom dia ?";
		a = a.toUpperCase();
		a = a.replace("?", "Bia");
		a = a.concat("!");
		System.out.println(a);
	}

}
