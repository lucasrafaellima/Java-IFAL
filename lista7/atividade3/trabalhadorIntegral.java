package lista7.atividade3;

public class trabalhadorIntegral extends trabalhador {

    public trabalhadorIntegral(int matricula, String nome, double salario, int idade, String endereco) {
        super(matricula, nome, salario, idade, endereco);
    }
    
    public double getSalario() {
        if (super.getIdade() <= 30) {
            return super.getSalario() + ((super.getSalario() * 16)/100);
        } else {
            return super.getSalario() + ((super.getSalario() * 25)/100);            
        }
    }

}
