package trello_m2s03;

public class contador {
    private String frase;

    
    public contador(String frase) {
        this.frase = frase;
    }

    public int contarPalavras() {
        
        String[] palavras = this.frase.split("\\s+");

        
        return palavras.length;
    }

    public static void main(String[] args) {
       
        String fraseTeste = "A FRASE DO DIA CONTABIL ";
        contador contador = new contador(fraseTeste);

       
        System.out.println("Frase: " + fraseTeste);
        System.out.println("Quantidade de palavras: " + contador.contarPalavras());
    }
}
