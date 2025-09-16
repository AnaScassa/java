package aula01;

import java.util.Iterator;
import java.util.Scanner;

public class Bolsa {
	
	Scanner scanner = new Scanner(System.in);

	public String modelo;
	public boolean aberta;
	public String itens[];
	public int i = 0;
	
	// Construtor - define o tamanho máximo da bolsa
	public Bolsa() {
		this.itens = new String[10]; 
	}
	
	void abrir() {
		this.aberta = true;
		System.out.println("Bolsa aberta");
	}
	
	void fechar() {
		this.aberta = false;
		System.out.println("Bolsa fechada");
	}

	void colocar() {
		if(this.aberta == true ) {
			System.out.println("Escreva o que deseja guardar na sua bolsa: ");
			itens[i] = scanner.next();
			i++;
			
		}else {
			System.out.println("Bolsa fechada");
		}
	}
	
	void ver() {
		for(int x = 0; x < i; x++) {
			System.out.println("Itens na sua bolsa: " + itens[x]);
		}
	}
}
