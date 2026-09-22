package lista8.atividade1;

public class seguroResidencial extends seguro {
    public seguroResidencial(int codigo, String nome, double valorSegurado, double valorSeguro) {
        super(codigo, nome, valorSegurado, valorSeguro);
    }

    @Override
    public double calcularPremio() {
        double premio = super.getValorSeguro() + (super.getValorSegurado() * 0.01);
        return premio;
    }

}