package trello_m2s02;

public class exemplo3 {

    public static void main(String[] args) {
        
        double[] notas = {8.5, 7.2, 9.0, 6.8, 8.0, 7.5, 9.5, 6.0, 8.8, 7.3};

        
        System.out.println("A média das notas é: " + calcularMedia(notas));
    }

    public static double calcularMedia(double[] notas) {
        
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        
        double media = soma / notas.length;

       
        return media;
    }
}
