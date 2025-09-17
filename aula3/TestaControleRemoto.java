package aula03;

import java.util.Scanner;

public class TestaControleRemoto {

	public static void main(String[] args) {
		int op ;
		Scanner scanner = new Scanner(System.in);
		
		ControleRemoto c1 = new ControleRemoto();
		
		do {
			System.out.println("***Controle Remoto***");
			System.out.println("Digite o que deseja fazer\n1-Ligar tv\n2-Desligar tv");
			System.out.println("3-Ver configurações atuais\n4-Mais volume\n5-Menos volume");
			System.out.println("6-Ligar mudo\n7-Play\n8-Pause\n9-Desligar programa...\n");
			op = scanner.nextInt();
			
			switch (op) {
			case 1:
				c1.ligar();
				break;
				
			case 2:
				c1.desligar();
				break;
				
			case 3:
				c1.abrirMenu();
				break;
				
			case 4:
				c1.maisVolume();
				break;
				
			case 5:
				c1.menosVolume();
				break;
				
			case 6:
				c1.ligarMudo();
				break;
				
			case 7:
				c1.play();
				break;
				
			case 8:
				c1.pause();
				break;

			default:
				System.out.println("Opção invalida");
				break;
			}
		} while (op != 9);
		
	}

}
