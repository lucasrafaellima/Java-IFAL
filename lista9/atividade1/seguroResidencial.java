package lista9.atividade1;

public class seguroResidencial extends seguro {
    
    public seguroResidencial(int codigo, String nomeSegurado, double valorSegurado, double valorBase) {
        super(codigo, nomeSegurado, valorSegurado, valorBase);
    }

    @Override
    public double calcularPremio() {
        return super.getValorBase() + (super.getValorSegurado() * 0.01); // Exemplo de cálculo específico para seguro residencial
    }

}
