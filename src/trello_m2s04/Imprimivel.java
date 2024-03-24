package trello_m2s04;

//Aqui estão as definições de classes do exemplo 1

//Interface Imprimivel
interface Imprimivel {
 void mostrarDados();
}

//Classes ContaPoupanca e ContaCorrente implementando Imprimivel
class ContaPoupanca implements Imprimivel {
 private String tipoConta;
 private int numeroConta;
 private int agencia;
 private String nomeTitular;
 private double saldo;

 // Construtor da classe ContaPoupanca
 public ContaPoupanca(String tipoConta, int numeroConta, int agencia, String nomeTitular, double saldo) {
     this.tipoConta = tipoConta;
     this.numeroConta = numeroConta;
     this.agencia = agencia;
     this.nomeTitular = nomeTitular;
     this.saldo = saldo;
 }

 // Método para mostrar os dados da conta poupança
 @Override
 public void mostrarDados() {
     System.out.println("Tipo de Conta: " + tipoConta);
     System.out.println("Número da Conta: " + numeroConta);
     System.out.println("Agência: " + agencia);
     System.out.println("Nome do Titular: " + nomeTitular);
     System.out.println("Saldo: " + saldo);
 }
}

class ContaCorrente implements Imprimivel {
 private String tipoConta;
 private int numeroConta;
 private int agencia;
 private String nomeTitular;
 private double saldo;

 // Construtor da classe ContaCorrente
 public ContaCorrente(String tipoConta, int numeroConta, int agencia, String nomeTitular, double saldo) {
     this.tipoConta = tipoConta;
     this.numeroConta = numeroConta;
     this.agencia = agencia;
     this.nomeTitular = nomeTitular;
     this.saldo = saldo;
 }

 // Método para mostrar os dados da conta corrente
 @Override
 public void mostrarDados() {
     System.out.println("Tipo de Conta: " + tipoConta);
     System.out.println("Número da Conta: " + numeroConta);
     System.out.println("Agência: " + agencia);
     System.out.println("Nome do Titular: " + nomeTitular);
     System.out.println("Saldo: " + saldo);
 }
}

//Classe principal Main para testar as classes ContaPoupanca e ContaCorrente
public class Main {
 public static void main(String[] args) {
     // Criando uma conta poupança
     ContaPoupanca poupanca = new ContaPoupanca("Poupança", 123, 456, "João", 1000.0);
     // Criando uma conta corrente
     ContaCorrente corrente = new ContaCorrente("Corrente", 789, 101, "Maria", 2000.0);
     
     // Mostrando os dados da conta poupança
     System.out.println("Dados da Conta Poupança:");
     poupanca.mostrarDados();
     System.out.println();
     
     // Mostrando os dados da conta corrente
     System.out.println("Dados da Conta Corrente:");
     corrente.mostrarDados();
 }
}
