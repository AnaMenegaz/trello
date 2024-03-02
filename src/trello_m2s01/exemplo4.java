package trello_m2s01;

import java.util.Scanner;

public class exemplo4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

       
        double soma = numero1 + numero2;
        System.out.println("Soma: " + soma);

      
        double subtracao = numero1 - numero2;
        System.out.println("Subtração: " + subtracao);

        
        double multiplicacao = numero1 * numero2;
        System.out.println("Multiplicação: " + multiplicacao);

        
        if (numero2 != 0) {
            
            double divisao = numero1 / numero2;
            System.out.println("Divisão: " + divisao);

            double resto = numero1 % numero2;
            System.out.println("Resto da divisão: " + resto);
        } else {
            System.out.println("Não é possível realizar a divisão por zero.");
        }

        scanner.close();
    }

}
