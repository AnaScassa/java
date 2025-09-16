package aula01;

import java.util.Scanner;

public class TestaBolsa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int op = 1, op2 = 0;
		
		Bolsa bolsa1 = new Bolsa();
		bolsa1.modelo = "Do mercado";
		bolsa1.aberta = false;
		
		do {
			System.out.println("Digite: \n1-Abrir a bolsa \n2-Fechar a bolsa \n3-Colocar itens na bolsa \n4-Ver itens na bolsa");
			op2 = scanner.nextInt();
			
			if (op2 == 1) {
				bolsa1.abrir();
			} else if(op2 == 2) {
				bolsa1.fechar();
			} else if(op2 == 3) {
				bolsa1.colocar();
			} else if(op2 == 4) {
				bolsa1.ver();
			} else {
				System.out.println("Opção invalida");
			}
			
			System.out.println("Deseja continuar no programa? 1-Sim / 2-Não");
			op = scanner.nextInt();
		} while (op == 1);
		
		
	}

}
