package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.10; // O modificador 'static' faz com que a variavel seja uma variavel de classe, ou seja, é alterado em todas as instancias.
	
	Produto(){
		
	}
	
	Produto(String nome, double preco){
		this.nome = nome; //Quando o nome da variavel do metodo é igual ao nome da variavel da classe, se ultiliza o 'this.' para referenciar.
		this.preco = preco;
	}
	
	double precoComDesconto() {
		return preco - preco * desconto;
	}
}
