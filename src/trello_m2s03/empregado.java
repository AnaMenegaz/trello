package trello_m2s03;

public class empregado {
    private String cpf;
    private String nome;
    private double salario;

    public empregado(String cpf, String nome, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public void promover(double percentual) {
        double aumento = this.salario * (percentual / 100);
        this.salario += aumento;
    }

    public static void main(String[] args) {
        
        empregado empregadoTeste = new empregado("123.456.789-00", "ANA", 3000.0);

       
        System.out.println("Antes da promoção:");
        System.out.println("CPF: " + empregadoTeste.cpf);
        System.out.println("Nome: " + empregadoTeste.nome);
        System.out.println("Salário: " + empregadoTeste.salario);

        
        empregadoTeste.promover(10);

        System.out.println("\nDepois da promoção:");
        System.out.println("CPF: " + empregadoTeste.cpf);
        System.out.println("Nome: " + empregadoTeste.nome);
        System.out.println("Salário: " + empregadoTeste.salario);
    }
}
