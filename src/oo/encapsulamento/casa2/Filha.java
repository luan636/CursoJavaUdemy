package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

public class Filha extends Sogra {

	String segredoDoCasal = "Meu marido está quase sendo demitido";
	
	public static void main(String[] args) {
		Filha euMesma = new Filha();
		System.out.println("Meus pais não sabem..." + euMesma.segredoDoCasal);
		System.out.println(euMesma.segredoDeFamilia); //O atributo herdado precisa ser acessado atraves da classe que herdou e não atraves da clase que foi herdada.
		
		//Genro meuAmor = new Genro();
		//System.out.println(meuAmor.segredo);
		
		Sogro papai = new Sogro();
		System.out.println(papai.gostaDeCerveja);
		
		//Sogra mamae = new Sogra();
		//System.out.println(mamae.segredoDeFamilia); //conforme escrito na linha 13, essa forma de acesso ao atributo daria erro.		
	}
}
