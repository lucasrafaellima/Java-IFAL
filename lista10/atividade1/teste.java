package lista10.atividade1;

import java.util.Scanner;
import java.util.Locale;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        retangulo ret = new retangulo();

        int resp = -1;
        double base = 0; 
        double altura = 0;

        while(resp != 0) {
            System.out.print("""
                1. Digitar valor de b e h
                2. Calcular Área
                3. Calcular Perímetro
                0. Sair
                Resposta: """);
            resp = sc.nextInt();
            
            switch(resp) {
                case 1:
                    System.out.print("Digite o valor da altura: ");
                    altura = sc.nextDouble();
                    System.out.print("Digite o valor da base: ");
                    base = sc.nextDouble();
                    System.out.println("Valores digitados: Altura = " + altura + ", Base = " + base);
                    break;
                case 2:
                    ret.calcularArea(altura, base);
                    break;
                case 3:
                    ret.calcularPerimetro(altura, base);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida! Informe um valor correto!");
                    break;
            }

        }
        sc.close();
    }
}
