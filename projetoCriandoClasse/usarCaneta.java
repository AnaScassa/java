package objeto;
import java.util.Scanner;
import classes.Canetas;

public class usarCaneta {

	//instanciando os objetos
    static Canetas c1 = new Canetas("preta", "bic", true, 100); // já atribuindo caracteristicas para cada um
    static Canetas c2 = new Canetas("vermelha", "fabercastell", true, 100);

    public static void main(String[] args) {
        escrever();  // chamando o método
    }

    public static void escrever() { 
        int op = 1, op2;
        String papel;
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Caneta 1:\nCor: %s\nMarca: %s\nCarga: %d\n", c1.getCor(), c1.getMarca(), c1.getCarga());
        System.out.printf("Caneta 2:\nCor: %s\nMarca: %s\nCarga: %d\n", c2.getCor(), c2.getMarca(), c2.getCarga());

        do {
            System.out.print("Deseja escrever algo? 1-Sim / 2-Não: ");
            op = scanner.nextInt();

            if(op == 1) {
                System.out.print("Qual caneta deseja usar? 1- vermelha ou 2- preta: ");
                op2 = scanner.nextInt();

                if(op2 == 1) {
                    System.out.print("Escreva: ");
                    papel = scanner.next();
                    c2.setCarga(c2.getCarga() - 10);
                    System.out.printf("A carga da caneta vermelha está em %d\n", c2.getCarga());
                    System.out.println("Sua palavra: " + papel);
                } else {
                    System.out.print("Escreva: ");
                    papel = scanner.next();
                    c1.setCarga(c1.getCarga() - 10);
                    System.out.printf("A carga da caneta preta está em %d\n", c1.getCarga());
                    System.out.println("Sua palavra: " + papel);
                }
            }

            System.out.print("Deseja continuar? 1-Sim / 2-Não: ");
            op = scanner.nextInt();

        } while(op == 1);
        System.out.print("Saindo do programa...");
        scanner.close();
    }
}
