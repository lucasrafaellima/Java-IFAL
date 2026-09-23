package lista8.atividade2;

public class planoPremium extends planoAcademia {
    
    public planoPremium(int codigo, String nomeCliente, int idade, double valorBase, int periodoContrato) {
        super(codigo, nomeCliente, idade, valorBase, periodoContrato);
    }

    @Override
    public double calcularMensalidade() {
        double premium = 0;
        if (super.getPeriodoContrato() <= 6) {
            premium = super.getValorBase() - (super.getValorBase() * 0.08);
        } else if (super.getPeriodoContrato() > 6) {
            premium = super.getValorBase() - (super.getValorBase() * 0.15);
        }

        return premium;

    }

}
