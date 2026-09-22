package lista8.atividade1;

public class seguroVida extends seguro {
    private int idade;

    public seguroVida(int codigo, String nome, double valorSegurado, double valorSeguro, int idade) {
        super(codigo, nome, valorSegurado, valorSeguro);
        this.idade = idade;
    }

    @Override
    public double calcularPremio() {
        double premio = super.getValorSeguro() + (super.getValorSegurado() * 0.02);

        if (idade > 55) {
            premio = premio + (premio * 0.02);
            return premio;
        } else {
            return premio;
        }

    }

}