package lista9.atividade1;

public class seguroVida extends seguro {

    private int idade;
    
    public seguroVida(int codigo, String nomeSegurado, double valorSegurado, double valorBase, int idade) {
        super(codigo, nomeSegurado, valorSegurado, valorBase);
        this.idade = idade;
    }

    @Override
    public double calcularPremio() {
        if (idade > 55) {
            return super.getValorBase() + (super.getValorSegurado() * 0.02) + (super.getValorSegurado() * 0.02); // Exemplo de cálculo específico para seguro de vida
            } else {
                return super.getValorBase() + (super.getValorSegurado() * 0.02); // Exemplo de cálculo específico para seguro de vida
            }
    }
    
}
