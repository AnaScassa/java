package projetoJava1;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		int op = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** Calculadora de média ***");
		do {
			double num1 = 0, num2 = 0, media = 0;
			System.out.println("Insira a primeira nota: ");
			num1 = scanner.nextDouble();
			System.out.println("Insira a segunda nota: ");
			num2 = scanner.nextDouble();
			
			media = (num1 + num2)/ 2;
			
			System.out.println("A média foi: " + media);
			
			if(media < 6) {
				System.out.println("Média insuficiente, reprovado");
			}else {
				System.out.println("Média suficiente, aprovado");
			}
			
			System.out.println("Deseja continuar? 1- Sim / 2- Não");
			op = scanner.nextInt();
			
		} while (op != 2);
		System.out.println("Saindo do programa...");
		scanner.close();
	}
}
