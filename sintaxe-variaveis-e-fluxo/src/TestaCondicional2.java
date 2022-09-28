
public class TestaCondicional2 {
	
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		
		int idade = 20;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;
		System.out.println("Idade = " + idade);
		System.out.println("Acompanhado(a)? R: " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Você pode entrar!");
		} else {
				System.out.println("Você não pode entrar!");
		}	
	}
}
