
public class FatoriaisDeUmADez {
	public static void main(String[] args) {
		int fatorial = 1;
		for (int contador = 1; contador <=10; contador++) {
			fatorial = fatorial * contador;
			System.out.println("O fatorial de " + contador + " é " + fatorial);
		}
	}
}
