package colecoes;

public class Array {

	public static void main(String[] args) {
	
		double[] notasJoao = {7.0, 8.7, 6.2, 4.9, 9.7};
		
		double[] notasPedro = new double[5]; //O tamanho do array precisa ser definido na sua criação e não pode ser modificado posteriormente.
		notasPedro[0] = 7.0; // O indice do array começa sempre do zero.
		notasPedro[1] = 8.7;
		notasPedro[2] = 6.2;
		notasPedro[3] = 4.9;
		notasPedro[4] = 9.7;
		
		double totalJoao = 0;
		for(double nota: notasJoao) { // For (each). Ele percorre todo o array. Serve para todos os tipos de colections.
			totalJoao += nota;
		}
//		for(int i = 0; i < notasJoao.length; i++) {
//			totalJoao += notasJoao[i];
//		}
		
		double totalPedro = 0;
		for(double nota: notasPedro) {
			totalPedro += nota;
		}
//		for(int i = 0; i < notasPedro.length; i++) {
//			totalPedro += notasPedro[i];
//		}
		System.out.printf("A Media do Pedro é: %.2f\n", totalPedro / notasPedro.length);
		System.out.printf("A Media do João é: %.2f\n", totalJoao / notasJoao.length);
	
	}
	
}
