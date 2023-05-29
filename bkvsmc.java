import java.util.Scanner;

public class bkvsmc {

    public static void main(String[] args) {

        int opção=0;
        do {
        try (Scanner pablinton = new Scanner (System.in)) {
            System.out.print("Opção 1: Big Tasty ");
            System.out.print("\nOpção 2: Whopper ");
            System.out.print("\nOpção 3: Quarteirão de queijo ");
            System.out.print ("\nEscolha sua opção: ");
            opção = pablinton.nextInt();
            

            switch (opção) {
                case 1:
                 System.out.println("\nBig Tasty selecionado.");
                 break;
                case 2:
                 System.out.println("\nWhopper selecionado.");
                 break;
                case 3:
                 System.out.println("Quarteirão de Queijo selecionado.");
                 break;
                default:
                 System.out.println("\nOpção inválida.");
                 break;
            }
        } while (opção < 1 || opção > 3); 
    } ;
}
}
 
    