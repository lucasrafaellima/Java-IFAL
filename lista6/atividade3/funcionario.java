package lista6.atividade3;

public class funcionario {
    private String nome;
    private int cpf;
    private double salario;
    private String dataNascimento;

    public funcionario(String nome, int cpf, double salario, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() { return this.nome; }

    public int getCpf() { return this.cpf; }

    public String dataNascimento() { return this.dataNascimento; }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do funcionario: " + this.nome);
        System.out.println("CPF do funcionario: " + this.cpf);
        System.out.println("Salario do funcionario: " + this.salario);
        System.out.println("Data de nascimento: " + this.dataNascimento);
    }

}
