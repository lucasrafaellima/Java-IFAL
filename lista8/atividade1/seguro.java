package lista8.atividade1;
public class seguro {
    private int codigo;
    private String nome;
    private double valorSegurado;
    private double valorSeguro;

    public seguro(int codigo, String nome, double valorSegurado, double valorSeguro) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorSegurado = valorSegurado;
        this.valorSeguro = valorSeguro;
    }

    public double calcularPremio() {
        return this.valorSeguro;
    }

    public double getValorSeguro() {
        return this.valorSeguro;
    }

    public double getValorSegurado() {
        return this.valorSegurado;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

}