package atividades;

import java.util.Scanner;

public class exemplo5 {

    public static void main(String[] args) {
        
        final double PI = 3.14;

        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

      
        double area = PI * raio * raio;
        System.out.println("Área do círculo: " + area);

        double perimetro = 2 * PI * raio;
        System.out.println("Perímetro do círculo: " + perimetro);

        scanner.close();
    }
}
