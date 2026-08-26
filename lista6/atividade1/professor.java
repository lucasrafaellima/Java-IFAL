package lista6.atividade1;

public class professor extends pessoa {
    private double salario;

    public professor(String nome, int cpf, String dataNascimento, double salario) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
    }
    
    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Salario do professor: ");
    }

}
