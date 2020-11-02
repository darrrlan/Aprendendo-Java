//Obtém a entrada do usuário a partir de um diálogo
package Exercício5;

import javax.swing.JOptionPane;

public class Exercício5 {

	public static void main(String[] args) {
		
		//pede para o usuário inseriri seu nome
		String name = JOptionPane.showInputDialog("Qual é seu nome?");
		
		//cria a mensagem
		String message = String.format("Bem vindo %s", name);
		
		//exibe a mensagem para cumprimentar o usuário pelo nome
		JOptionPane.showMessageDialog(null, message);
		
	}//fim main
}//fim Exercício5
