package lista7.atividade3;

public class trabalhadorHorista extends trabalhador {
    private double totalHoras;
    private double salarioHora;

    public trabalhadorHorista(int matricula, String nome, double salario, int idade, String endereco, double totalHoras, double salarioHora) {
        super(matricula, nome, salario, idade, endereco);
        this.totalHoras = totalHoras;
        this.salarioHora = salarioHora;
    }
    @Override
    public double getSalario() {
        return totalHoras * salarioHora;
    }

}
