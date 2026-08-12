package lista4;

import java.util.Scanner;
import java.util.Locale;

public class atividade5 {

    public double celsiusfarenheit(double f) {
        double c;

        c = ((5* f) - (5 * 32)) / 9;

        return c;

    }

    public double celsiuskelvin(double k) {
        double c;

        c = k - 273;

        return c;

    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        atividade5 calc = new atividade5();

        int valor = -1;

        while (valor != 0) {
            System.out.print("Digite uma das opções abaixo: \n 1- informar temperatura em farenheit \n 2- informar temperatura em Kelvin \n 0- sair \n respota: ");
            valor = sc.nextInt();
            
            switch(valor) {
                case 1:
                    System.out.print("Digite o valor: ");
                    double farenheit = sc.nextDouble();
                    System.out.println("O valor de farenheit pra celsius é: " + calc.celsiusfarenheit(farenheit));
                    break;
                case 2:
                    System.out.print("Digite o valor: ");
                    double kelvin = sc.nextDouble();
                    System.out.println("O valor de kelvin pra celsius é: " + calc.celsiuskelvin(kelvin));
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Esse valor não está correto!");
                    break;
            }
        }

        sc.close();

    }    
}