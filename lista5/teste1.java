package lista5;

import java.util.Scanner;
import java.util.Locale;
import lista5.retangulo;

public class teste1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int valor = -1;
        double b = 0;
        double h = 0;

        while (valor != 0) {
            System.out.print("""
                    Informe uma das opcoes abaixo:
                    1. Criar um retangulo
                    2. Calcular Area
                    3. Calcular perimetro
                    0- Sair
                    Resposta:
                    """);
            valor = sc.nextInt();

            switch(valor) {
                case 1:
                    System.out.print("Informe o valor da base: ");
                    b = sc.nextDouble();
                    System.out.print("Informe o valor da altura: ");
                    h = sc.nextDouble();
                    break;
                case 2:
                    double a = retangulo.area(b, h);
                    System.out.println("Valor da area é: " + a);
                    break;
                case 3:
                    double p = retangulo.perimetro(b, h);
                    System.out.println("O perimetro é: " + p);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opcao errada!");
                    break;
            }

        }

        sc.close();

    }       
}
