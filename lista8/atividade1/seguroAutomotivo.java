package lista8.atividade1;

public class seguroAutomotivo extends seguro {
    
    public seguroAutomotivo(int codigo, String nome, double valorSegurado, double valorSeguro){
        super(codigo, nome, valorSegurado, valorSeguro);
    }

    @Override 
    public double calcularPremio() {
        double premio = super.getValorSeguro() + (super.getValorSegurado() * 0.03);
        return premio;
    }

}