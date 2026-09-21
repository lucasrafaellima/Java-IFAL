package lista7.atividade2;

public class conta {
    private int numConta;
    private String cpf;
    private double saldo;
    private double taxa;
    private String banco;
    
    public conta(int numConta, String cpf, double saldo, double taxa, String banco) {
        this.numConta = numConta;
        this.cpf = cpf;
        this.saldo = saldo;
        this.taxa = taxa;
        this.banco = banco;
    }

    public double saque(double valor) {
        setSaldo(getSaldo() - valor);
        return getSaldo();
    }

    public double deposito(double valor) {
        setSaldo(getSaldo() + valor);
        return getSaldo();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public double getTaxa() {
        return taxa;
    }

    public void atualizarSaldo() {
        setSaldo(getSaldo() - taxa);
    }

}
