
public class TestaConversao {

	public static void main(String[] args) {
		
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		long numeroGrande = 2452423145252343134l;
		short valorPequeno = 2131;
		byte b = 127;
		System.out.println(numeroGrande);
		System.out.println(valorPequeno);
		System.out.println(b);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);

	}
}
