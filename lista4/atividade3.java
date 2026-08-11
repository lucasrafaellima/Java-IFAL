package lista4;

import java.util.Scanner;
import java.util.Locale;

public class atividade3 {

    public double imposto(double v) {
        if (v < 2000) {
            return 0;
        } else if (v < 3500) {
            return (v * 15) / 100;
        } else if (v < 5000) {
            return (v * 22) / 100; 
        } else {
            return (v * 30) / 100;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        atividade3 calc = new atividade3();

        System.out.print("Digite o valor que deseja calcular o imposto: ");
        double valor = sc.nextDouble();

        if (valor < 2000) {
            System.out.println("Valor isento! " + calc.imposto(valor));
            calc.imposto(valor);
        } else if (valor < 3500) {
            System.out.println("Imposto de 15%! " + calc.imposto(valor));
            calc.imposto(valor);
        } else if (valor < 5000) {
            System.out.println("Imposto de 22%! " + calc.imposto(valor));
            calc.imposto(valor);
        } else {
            System.out.println("Imposto de 30%! " + calc.imposto(valor));
        }

        sc.close();

    }    
}
