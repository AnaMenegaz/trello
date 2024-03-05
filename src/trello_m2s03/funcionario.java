package trello_m2s03;

public class funcionario {
    private String nome;
    private float salario;

    // Construtor que recebe apenas o nome
    public funcionario(String nome) {
        this.nome = nome;
    }

    // Construtor que recebe nome e salário
    public funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método para aumentar o salário
    public void aumentar(float valor) {
        this.salario += valor;
    }

    // Métodos getters e setters para nome e salário (opcional)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public static void main(String[] args) {
       
        funcionario funcionario1 = new funcionario("João", 2000.0f);

        
        System.out.println("Antes do aumento:");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário: " + funcionario1.getSalario());

        
        funcionario1.aumentar(500.0f);

       
        System.out.println("\nDepois do aumento:");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário: " + funcionario1.getSalario());
    }
}
