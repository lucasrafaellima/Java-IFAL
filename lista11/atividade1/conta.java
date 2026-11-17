package lista11.atividade1;

abstract public class conta {
    private int num;
    private int agencia;
    private String nomeCLiente;
    private double saldo;

    public conta(int num, int agencia, String nomeCLiente, double saldo) {
        this.num = num;
        this.agencia = agencia;
        this.nomeCLiente = nomeCLiente;
        this.saldo = saldo;
    }

    public double creditar() {
        return saldo;
    }

    public double debitar() {
        return saldo;
    }

    abstract public double atualizarSaldo();

}
