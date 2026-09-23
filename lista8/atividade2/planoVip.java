package lista8.atividade2;

public class planoVip extends planoAcademia {
    
    public planoVip(int codigo, String nomeCLiente, int idade, double valorBase, int periodoContrato) {
        super(codigo, nomeCLiente, idade, valorBase, periodoContrato);
    }

    @Override
    public double calcularMensalidade() {
        double vip =0;
        if (super.getPeriodoContrato() <= 6) {
            vip = super.getValorBase() - (super.getValorBase() * 0.1);
        } else if (super.getPeriodoContrato() > 6) {
            vip = super.getValorBase() - (super.getValorBase() * 0.2);
        }

        if (super.getIdade() >= 60) {
            vip = vip - (vip * 0.1);
        }

        return vip;

    }

}
