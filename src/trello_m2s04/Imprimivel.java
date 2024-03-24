package trello_m2s04;

interface Imprimivel {
 void mostrarDados();
}

class ContaPoupanca implements Imprimivel {
 private String tipoConta;
 private int numeroConta;
 private int agencia;
 private String nomeTitular;
 private double saldo;

 public ContaPoupanca(String tipoConta, int numeroConta, int agencia, String nomeTitular, double saldo) {
     this.tipoConta = tipoConta;
     this.numeroConta = numeroConta;
     this.agencia = agencia;
     this.nomeTitular = nomeTitular;
     this.saldo = saldo;
 }

 @Override
 public static void mostrarDados() {
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

 public ContaCorrente(String tipoConta, int numeroConta, int agencia, String nomeTitular, double saldo) {
     this.tipoConta = tipoConta;
     this.numeroConta = numeroConta;
     this.agencia = agencia;
     this.nomeTitular = nomeTitular;
     this.saldo = saldo;
 }

 @Override
 public void mostrarDados() {
     System.out.println("Tipo de Conta: " + tipoConta);
     System.out.println("Número da Conta: " + numeroConta);
     System.out.println("Agência: " + agencia);
     System.out.println("Nome do Titular: " + nomeTitular);
     System.out.println("Saldo: " + saldo);
 }
}

public class Main {
 public static void main(String[] args) {
   
     ContaPoupanca poupanca = new ContaPoupanca("Poupança", 123, 456, "João", 1000.0);

     ContaCorrente corrente = new ContaCorrente("Corrente", 789, 101, "Maria", 2000.0);
  
     System.out.println("Dados da Conta Poupança:");
     poupanca.mostrarDados();
     System.out.println();
    
     System.out.println("Dados da Conta Corrente:");
     corrente.mostrarDados();
 }
}
