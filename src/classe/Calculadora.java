package classe;

public class Calculadora { //Classe para demonstrar todos os tipos de metodos
	double resultado;
	
	double somar(double a, double b) { // Recebe parametro e tem um retorno
		resultado = a + b;
		return resultado;
	}
	
	void acrescentar(double a) { // Recebe parametro e n�o tem retorno
		resultado += a;
	}
	
	double obterResultado() { // N�o recebe parametro mas tem retorno
		return resultado;
	}
	
	void limpar() { // N�o recebe parametro e n�o tem retorno 
		resultado = 0;
	}
	
}
