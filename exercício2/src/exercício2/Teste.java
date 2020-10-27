package exercício2;// indica o caminho do programa. Obs: muito importante 

import java.util.Scanner;//Biblioteca para receber informações do teclado

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//cria um objeto
		
		Account conta = new Account();//cria uma class
		
		System.out.printf("Nome inicial: %s%n%n",conta.getName());// apenas para mostrar no console
		
		System.out.println("Seu nome: \n");//escreve no console
		
		String nome = input.nextLine();//recebe a informação do teclado
		
		conta.setName(nome);//muda o nome que está na conta por padrão
		
		System.out.printf("Nome inicial: %s%n%n",conta.getName());//mostra no console
	}//fim da main
}//fim do Teste
