package api;

public class ExplorandoStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); //Essencial para casos onde varias strings vão ser concatenadas.
		sb.append("João");
		sb.append(",").append("Maria");
		sb.append(",").append("Pedro");
		
		// É mutável
		//sb.reverse();
		
		System.out.println(sb.toString());
		System.out.println(sb.substring(1, 3));
		System.out.println(sb.toString()); //Converte pra string.
	}
}
