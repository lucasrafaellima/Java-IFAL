package lista4;

import java.util.Scanner;
import java.util.Locale;

public class atividade6 {

    public double mostrar() {
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double[] notas = new double[4];

        for (int i =0; i < notas.length; i++) {
            System.out.print("Digite a nota de ordem " + i + ": ");
            notas[i] = sc.nextDouble();
        }

    }    
}
