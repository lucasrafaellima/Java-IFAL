package lista10.atividade1;

public class retangulo implements objetoGeometrico {
    @Override
    public void calcularArea(double a, double b) {
        System.out.println("Área: " + (a * b));
    }
    
    @Override
    public void calcularPerimetro(double a, double b) {
        System.out.println("Perímetro: " + (2 * (a + b)));
    }
}
