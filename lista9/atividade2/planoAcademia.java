package lista9.atividade2;

abstract public class planoAcademia {
    private int codigo;
    private String nomeCliente;
    private int idade;
    private double valorBase;
    private int periodoContrato;

    public planoAcademia(int codigo, String nomeCliente, int idade, double valorBase, int periodoContrato) {
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.idade = idade;
        this.valorBase = valorBase;
        this.periodoContrato = periodoContrato;
    }

    abstract public double calcularMensalidade();

    public double getValorBase() {
        return valorBase;
    }

    public int getPeriodoContrato() {
        return periodoContrato;
    }

    public int getIdade() {
        return idade;
    }

}
