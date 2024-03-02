package trello_m2s02;

import java.util.Scanner;

public class exemplo5 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        
        int[] array = new int[tamanho];

       
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

       
        inverterArray(array);

        System.out.println("Array invertido:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + " ");
        }

       
        scanner.close();
    }

    public static void inverterArray(int[] array) {
       
        int fim = array.length - 1;

        for (int i = 0; i < array.length / 2; i++) {
           
            int temp = array[i];
            array[i] = array[fim - i];
            array[fim - i] = temp;
        }
    }
}
