package trello_m2s02;

import java.util.Scanner;

public class exemplo1 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Digite o número inicial do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o número final do intervalo: ");
        int fim = scanner.nextInt();

        
        int soma = 0;

       
        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }

      
        System.out.println("A soma dos números no intervalo de " + inicio + " a " + fim + " é: " + soma);

    
        scanner.close();
    }
}
