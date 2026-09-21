package lista7.atividade2;

public class contaCorrente extends conta {
    public contaCorrente(int numConta, String cpf, double saldo, double taxa, String banco)  {
        super(numConta, cpf, saldo, taxa, banco);
    }   

    @Override
    public double saque(double valor) {
        super.setSaldo(super.getSaldo() - valor - 0.3);
        return super.getSaldo();
    }

}
