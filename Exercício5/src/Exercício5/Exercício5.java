//Obt�m a entrada do usu�rio a partir de um di�logo
package Exerc�cio5;

import javax.swing.JOptionPane;

public class Exerc�cio5 {

	public static void main(String[] args) {
		
		//pede para o usu�rio inseriri seu nome
		String name = JOptionPane.showInputDialog("Qual � seu nome?");
		
		//cria a mensagem
		String message = String.format("Bem vindo %s", name);
		
		//exibe a mensagem para cumprimentar o usu�rio pelo nome
		JOptionPane.showMessageDialog(null, message);
		
	}//fim main
}//fim Exerc�cio5
