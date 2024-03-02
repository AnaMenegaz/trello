package trello_m2s02;

import java.util.Scanner;

public class exemplo2 {

    public static void main(String[] args) {
      
        verificarPrimo();
    }

    public static void verificarPrimo() {
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

       
        boolean primo = true;
        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

       
        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}
