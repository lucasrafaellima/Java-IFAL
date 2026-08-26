package lista6.atividade2;

public class contaCorrente extends conta {
    
    public contaCorrente(int numConta, double taxa, double saldo, String banco) {
        super(numConta, taxa, saldo, banco);
    }
    
    public void atualizar() {
        setSaldo(getSaldo() - getTaxa());
    }    
}
