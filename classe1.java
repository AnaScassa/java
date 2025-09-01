package projetoJava1;

import java.util.Scanner; //lembrar que precisa importar

public class classe1 {

		public static void main(String[] args) {
			System.out.println("Hello, word! :)"); //Saida no prompt
			Scanner scanner = new Scanner(System.in); // método para ler o q o usuario escrever
			// scanner é um função para colocar o valor na variavel
			// Nome da classe / nome do objeto / new / Iniciação do objeto
			
			// usar para entrada de dados
			System.out.println("Insira 1- Feminimo /  2- Masculino: ");
			int genero = scanner.nextInt(); //nextInt para int
			System.out.println("Entre com o seu nome: ");
			String nome = scanner.next(); // apenas next para string
			if(genero == 1) {
				System.out.println("Bem vinda, " + nome + "!");
			}else if(genero == 2) {
				System.out.println("Bem vindo," + nome + "!");
			} else {
				System.out.println("SAIA DO PROGRAMA, " + nome + "!");
			}
			
			scanner.close();
		}
}
