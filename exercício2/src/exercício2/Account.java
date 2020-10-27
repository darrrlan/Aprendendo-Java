package exercício2;//caminho do arquivo

public class Account {
	
	String nome;//variável
	
	public Account() {
		super();//construtor
		this.nome = new String("Padrão");//this para dizer que é variável de instância,
		//e a variável está recebendo uma string padrão 
	}//fim Account 

	public String getName() {
		return this.nome;//retorna a variável para o Teste
	}//fim do getName
	
	public void setName(String nome) {
		
		this.nome = nome;//A variável de instância recebe a string da variável global que é nome
		
	}//fim do setName
}//fim do Account
