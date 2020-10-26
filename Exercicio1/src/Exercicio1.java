import java.util.Scanner;

public class Exercicio1{
	
	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int sum;
		
		System.out.print("Digite um número:\n");
		numero1 = input.nextInt();
		System.out.print("Digite o segundo número:\n");
		numero2 = input.nextInt();
		
		sum = numero1 + numero2;
		
		System.out.printf("A soma é: %d", sum);
	}
	
}