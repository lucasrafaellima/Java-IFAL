package lista9.atividade1;

abstract public class seguro {
    private int codigo;
    private String nomeSegurado;
    private double valorSegurado;
    private double valorBase;

    public seguro(int codigo, String nomeSegurado, double valorSegurado, double valorBase) {
        this.codigo = codigo;
        this.nomeSegurado = nomeSegurado;
        this.valorSegurado = valorSegurado;
        this.valorBase = valorBase;
    }

    abstract public double calcularPremio();

    public double getValorBase() {
        return valorBase;
    }

    public double getValorSegurado() {
        return valorSegurado;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

}
