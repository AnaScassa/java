package aula04;

import java.util.Iterator;

public class Combate {

	public static void main(String[] args) {
		Lutador l[] = new Lutador[3];
				
		l[0] = new Lutador("Lutador1", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador("Lutador2", "Brasil", 29, 1.68f, 73.6f, 14, 2, 3);
		l[2] = new Lutador("Lutador3", "Russia", 36, 1.78f, 93.6f, 4, 7, 1);

		for (int i = 0; i < 3; i++) {
			l[i].apresentar();
			l[i].status();
		}
		
	}

}