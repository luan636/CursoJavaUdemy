package controle;

public class Break {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if(i == 2) {
				break; // O break nunca esta relaciodado � estrutura de repeti��o 'if'.
			}
			
			System.out.println(i);
		}
		System.out.println("FIM");
	}
}
