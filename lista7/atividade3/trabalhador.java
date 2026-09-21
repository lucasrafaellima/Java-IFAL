package lista7.atividade3;

public class trabalhador {
    private int matricula;
    private String nome;
    private double salario;
    private int idade;
    private String endereco;

    public trabalhador(int matricula, String nome, double salario, int idade, String endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.endereco = endereco;
    }

    public double getSalario() {
        return this.salario;
    }

    public int getIdade() {
        return this.idade;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

}
