package trello_m2s02;

import java.util.Scanner;

public class exemplo4 {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número para a tabela de multiplicação: ");
        int numero = scanner.nextInt();

        
        System.out.println("Tabela de Multiplicação do número " + numero + ":");

        
        for (int i = 1; i <= 10; i++) {
           
            int resultado = numero * i;
           
            System.out.println(numero + " x " + i + " = " + resultado);
        }

      
        scanner.close();
    }
}
