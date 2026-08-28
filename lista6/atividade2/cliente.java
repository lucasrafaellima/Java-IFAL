package lista6.atividade2;

public class cliente {
    private String nome;
    private int cpf;
    private contaCorrente contaCorrente;
    private contaPoupanca contaPoupanca;
    
    public cliente(String nome, int cpf, contaCorrente contaCorrente, contaPoupanca contaPoupanca) {
        this.nome = nome;
        this.cpf = cpf;
        this.contaCorrente = contaCorrente;
        this.contaPoupanca = contaPoupanca;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return this.cpf;
    } 

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public contaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public contaCorrente getContaCorrente() {
        return contaCorrente;
    }

}
