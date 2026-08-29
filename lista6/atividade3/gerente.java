package lista6.atividade3;

public class gerente extends funcionario {
    public void calcularSalario() {
        double gratificacao = 2000;
        setSalario(getSalario() + gratificacao);
        System.out.println("Salario do " + getNome() + "  gratificacao: " + getSalario());        
    }   
    
    public gerente(String nome, int cpf, double salario, String dataNascimento) {
        super(nome, cpf, salario, dataNascimento);
    }

}
