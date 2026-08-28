package lista6.atividade2;

public class conta {
    private int numConta;
    private double taxa;
    private double saldo;
    private String banco;

    public conta(int numConta, double taxa, double saldo, String banco) {
        this.numConta = numConta;
        this.taxa = taxa;
        this.saldo = saldo;
        this.banco = banco;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Saldo atual: " + this.saldo);
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saldo atual: " + this.saldo);
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void atualizar() {

    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getTaxa() {
        return this.taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getBanco() {
        return this.banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

}