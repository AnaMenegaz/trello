package trello_m2s04;

import java.util.ArrayList;

//Interface Imprimivel
interface Imprimivel {
 void mostrarDados();
}

//Classe ContaBancaria implementando Imprimivel
class ContaBancaria implements Imprimivel {
 private String tipoConta;
 private int numeroConta;
 private int agencia;
 private String nomeTitular;
 private double saldo;

 // Construtor da classe ContaBancaria
 public ContaBancaria(String tipoConta, int numeroConta, int agencia, String nomeTitular, double saldo) {
     this.tipoConta = tipoConta;
     this.numeroConta = numeroConta;
     this.agencia = agencia;
     this.nomeTitular = nomeTitular;
     this.saldo = saldo;
 }

 // Método para mostrar os dados da conta bancária
 @Override
 public void mostrarDados() {
     System.out.println("Tipo de Conta: " + tipoConta);
     System.out.println("Número da Conta: " + numeroConta);
     System.out.println("Agência: " + agencia);
     System.out.println("Nome do Titular: " + nomeTitular);
     System.out.println("Saldo: " + saldo);
     System.out.println();
 }

 // Métodos getters e setters
 public int getNumeroConta() {
     return numeroConta;
 }
}

//Classe Banco
class banco {
 private ArrayList<ContaBancaria> contas;

 // Construtor da classe Banco
 public Banco() {
     contas = new ArrayList<>();
 }

 // Método para adicionar uma conta ao banco
 public void adicionarConta(ContaBancaria conta) {
     contas.add(conta);
 }

 // Método para remover uma conta do banco com base no número da conta
 public void removerConta(int numeroDaConta) {
     for (int i = 0; i < contas.size(); i++) {
         if (contas.get(i).getNumeroConta() == numeroDaConta) {
             contas.remove(i);
             System.out.println("Conta removida com sucesso.");
             return;
         }
     }
     System.out.println("Conta não encontrada.");
 }

 // Método para mostrar os dados de todas as contas no banco
 public void mostrarContas() {
     for (ContaBancaria conta : contas) {
         conta.mostrarDados();
     }
 }
}

public class Main {
 public static void main(String[] args) {
     // Criando um banco
     Banco banco = new Banco();

     // Adicionando algumas contas ao banco
     banco.adicionarConta(new ContaBancaria("Poupança", 123, 456, "João", 1000.0));
     banco.adicionarConta(new ContaBancaria("Corrente", 789, 101, "Maria", 2000.0));

     // Mostrando as contas no banco
     System.out.println("Contas no banco:");
     banco.mostrarContas();

     // Removendo uma conta do banco
     banco.removerConta(123);

     // Mostrando as contas atualizadas no banco
     System.out.println("Contas no banco após remoção:");
     banco.mostrarContas();
 }
}
