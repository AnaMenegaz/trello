package trello_m2s03;

public class heroi {
    private String nome;
    private String superpoder;
    private String nomeDaVidaReal;
    private String universo;

    public heroi(String nome, String superpoder, String nomeDaVidaReal, String universo) {
        this.nome = nome;
        this.superpoder = superpoder;
        this.nomeDaVidaReal = nomeDaVidaReal;
        this.universo = universo;
    }

    
    public void atacar() {
        System.out.println(nome + " está atacando!");
    }

  
    public static void main(String[] args) {
       
        heroi heroiTeste = new heroi("Homem-Aranha", "Sentido-Aranha", "Peter Parker", "Marvel");

       
        heroiTeste.atacar();
    }
}
