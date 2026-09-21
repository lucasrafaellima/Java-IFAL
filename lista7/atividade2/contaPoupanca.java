package lista7.atividade2;

public class contaPoupanca extends conta {
    public contaPoupanca(int numConta, String cpf, double saldo, double taxa, String banco)  {
        super(numConta, cpf, saldo, taxa, banco);
    }   

    @Override 
    public void atualizarSaldo() {
        super.setSaldo(super.getSaldo() + super.getTaxa());

        System.out.println("Poupanca atualizada com sucesso!");
    }

}
