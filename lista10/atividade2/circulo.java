package lista10.atividade2;

import lista10.atividade1.objetoGeometrico;

public class circulo implements objetoGeometrico {
    @Override
    public void calcularArea(double a, double b) {
        // TODO Auto-generated method stub
        System.out.println("Área: " + (a * (b * b)));
    }

    @Override 
    public void calcularPerimetro(double a, double b) {
        // TODO Auto-generated method stub
        System.out.println("Perímetro: " + ((2 * a * b) * b - b) );
    }

}
