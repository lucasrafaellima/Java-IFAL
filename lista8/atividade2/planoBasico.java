package lista8.atividade2;

public class planoBasico extends planoAcademia {

    public planoBasico(int codigo,String nomeCliente, int idade, double valorBase, int periodoContrato) {
        super(codigo, nomeCliente, idade, valorBase, periodoContrato);
    }
    
    @Override
    public double calcularMensalidade() {
        double basico = 0;
        if (super.getPeriodoContrato() <= 6) {
            basico = super.getValorBase() - (super.getValorBase() * 0.05);
        } else if (super.getPeriodoContrato() > 6) {
            basico = super.getValorBase() - (super.getValorBase() * 0.1);
        }
        
        return basico;

    }

}
