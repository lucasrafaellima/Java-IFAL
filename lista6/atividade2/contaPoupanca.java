package lista6.atividade2;

public class contaPoupanca extends conta {

    public contaPoupanca(int numConta, double taxa, double saldo, String banco) {
        super(numConta, taxa, saldo, banco);
    }

    @Override
    public void atualizar() {
        setSaldo(getSaldo() + getTaxa());
    }

}