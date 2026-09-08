package lista7.atividade1;

public class gerente extends funcionario {
    private String departamento;


    public gerente(String nome, String cpf, String nascimento, double salario, String departamento) {
        super(nome, cpf, nascimento, salario);
        this.departamento = departamento;
    }

    public double getSalario() {
        return super.getSalario() + 1500;
    }

}
