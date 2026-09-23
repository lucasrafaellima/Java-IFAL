package lista8.atividade2;

public class planoAcademia {
    private int codigo;
    private String nomeCliente;
    private int idade;
    private double valorBase;
    private int periodoContrato;
    
    public planoAcademia(int codigo, String nomeCLiente, int idade, double valorBase, int periodoContrato) {
        this.codigo = codigo;
        this.nomeCliente = nomeCLiente;
        this.idade = idade;
        this.valorBase = valorBase;
        this.periodoContrato = periodoContrato;
    }

    public double calcularMensalidade() {
        return this.valorBase;
    }

    public int getPeriodoContrato() {
        return this.periodoContrato;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getValorBase() {
        return this.valorBase;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

}
