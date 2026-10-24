package lista9.atividade1;

public class seguroAutomotivo extends seguro {
    
    public seguroAutomotivo(int codigo, String nomeSegurado, double valorSegurado, double valorBase) {
        super(codigo, nomeSegurado, valorSegurado, valorBase);
    }

    @Override
    public double calcularPremio() {
        return super.getValorBase() + (super.getValorSegurado() * 0.03); // Exemplo de cálculo específico para seguro automotivo
    }
    
}
