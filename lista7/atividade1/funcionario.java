package lista7.atividade1;

public class funcionario extends pessoa {
    private double salario;

    public funcionario(String nome, String cpf, String nascimento, double salario) {
        super(nome, cpf, nascimento);
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}