package exercício3;

import java.util.Scanner;

public class exercício3 {
	
	public static void main(String[] args) {
		Account account1 = new Account("Darlan", 50.0);
		Account account2 = new Account("Ana Caroline" , 100.0);

		System.out.printf("%s balance: $%.2f %n%n",account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n",account2.getName(), account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1\n");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		System.out.printf("%s balance $%.2f %n", account1.getName(),account1.getBalance());
		System.out.printf("%s blance: $%.2f %n%n", account2.getName(),account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: \n");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		System.out.printf("%s balance $%.2f to account1 balance%n%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance $%.2f to account2 balance%n%n", account2.getName(), account2.getBalance());
	}
 
}
