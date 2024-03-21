package trello_m2s04;

public class ContaCorrente extends ContaBancaria {
    private double taxaDeOperacao;

 
    public ContaCorrente(int numeroDaConta, int agencia, String nomeDoTitular, double saldo, double taxaDeOperacao) {
        super(numeroDaConta, agencia, nomeDoTitular, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0) {
            double valorComTaxa = valor + taxaDeOperacao;
            if (getSaldo() >= valorComTaxa) {
                double novoSaldo = getSaldo() - valorComTaxa;
                setSaldo(novoSaldo); 
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    private void setSaldo(double novoSaldo) {
		
	}

	public static void main(String[] args) {
     
        ContaCorrente contaCorrente = new ContaCorrente(1234, 5678, "Ana Ju", 1000.0, 2.0);

       
        System.out.println("Informações da conta corrente:");
        System.out.println("Número da conta: " + contaCorrente.getNumeroDaConta());
        System.out.println("Agência: " + contaCorrente.getAgencia());
        System.out.println("Nome do titular: " + contaCorrente.getNomeDoTitular());
        System.out.println("Saldo: R$" + contaCorrente.getSaldo());

       
        contaCorrente.sacar(200.0);

        System.out.println("Saldo após saque: R$" + contaCorrente.getSaldo());
    }
}

