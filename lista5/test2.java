package lista5;

import lista5.circulo;
import java.util.Scanner;
import java.util.Locale;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int valor = -1;
        double r = 0;

        while (valor != 0) {
            System.out.print("""
                    1. Criar um círculo (Informar valor de r)
                    2. Calcular Área
                    3. Calcular Perímetro
                    0. Sair
                    Resposta:
                    """);
            valor = sc.nextInt();

            switch(valor) {
                case 1:
                    System.out.print("Informe o valor do raio: ");
                    r = sc.nextDouble();
                    break;
                case 2:
                    double area = circulo.calcularArea(r);
                    System.out.println("Valor da area é: " + area);
                    break;
                case 3:
                    double perimetro = circulo.calcularPerimetro(r);
                    System.out.println("Valor do perimetro é: " + perimetro);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Valor informado não está correto!");
                    break;
            }        

        }
        sc.close();

    }       
}
