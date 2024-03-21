package trello_m2s04;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeJuros;

    public ContaPoupanca(int numeroDaConta, int agencia, String nomeDoTitular, double saldo, double taxaDeJuros) {
        super(numeroDaConta, agencia, nomeDoTitular, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public void adicionarJuros() {
        double juros = getSaldo() * (taxaDeJuros / 100);
        depositar(juros);
        System.out.println("Juros adicionados: R$" + juros);
    }

    public static void main(String[] args) {
     
        ContaPoupanca contaPoupanca = new ContaPoupanca(1234, 5678, "Najulha", 1000.0, 0.5);

        System.out.println("Informações da conta poupança:");
        System.out.println("Número da conta: " + contaPoupanca.getNumeroDaConta());
        System.out.println("Agência: " + contaPoupanca.getAgencia());
        System.out.println("Nome do titular: " + contaPoupanca.getNomeDoTitular());
        System.out.println("Saldo: R$" + contaPoupanca.getSaldo());

        contaPoupanca.adicionarJuros();

    
        System.out.println("Saldo após adição de juros: R$" + contaPoupanca.getSaldo());
    }
}
