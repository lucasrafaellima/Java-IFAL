package lista9.atividade2;

public class planoVip extends planoAcademia {
    public planoVip(int codigo, String nomeCliente, int idade, double valorBase, int periodoContrato) {
        super(codigo, nomeCliente, idade, valorBase, periodoContrato);
    }

    @Override
    public double calcularMensalidade() {
        double mensalidade = 0;
        if (super.getPeriodoContrato() < 6) {
            if (super.getIdade() >= 60) {
                mensalidade = (super.getValorBase() - (super.getValorBase() * 0.10)) - (super.getValorBase() * 0.10);
            } else {
                mensalidade = super.getValorBase() - (super.getValorBase() * 0.10);
            }
        } else if (super.getPeriodoContrato() > 6) {
            if (super.getIdade() >= 60) {
                mensalidade = (super.getValorBase() - (super.getValorBase() * 0.20)) - (super.getValorBase() * 0.10);
            } else {
                mensalidade = super.getValorBase() + (super.getValorBase() * 0.20);
            }
            
        }
        return mensalidade;
    }

}
