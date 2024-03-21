package trello_m2s04;

public class ContaBancaria {
    private int numeroDaConta;
    private int agencia;
    private String nomeDoTitular;
    private double saldo;

    public ContaBancaria(int numeroDaConta, int agencia, String nomeDoTitular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    public static void main(String[] args) {
   
        ContaBancaria conta = new ContaBancaria(1234, 5678, "Ana", 1000.0);

        System.out.println("Informações da conta:");
        System.out.println("Número da conta: " + conta.getNumeroDaConta());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Nome do titular: " + conta.getNomeDoTitular());
        System.out.println("Saldo: R$" + conta.getSaldo());

        conta.depositar(500.0);

       System.out.println("Saldo após depósito: R$" + conta.getSaldo());

        conta.sacar(200.0);

        System.out.println("Saldo após saque: R$" + conta.getSaldo());
    }
}

