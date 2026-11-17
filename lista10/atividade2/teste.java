package lista10.atividade2;

import java.util.Locale;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        circulo circ = new circulo();
        int resp = -1;
        double pi = 0;
        double raio = 0;

        while(resp != 0) {
            System.out.print("""
                1 – Digitar valor de π e r
                2 – Calcular Área
                3 – Calcular Perímetro
                0 - Sair
                Resposta: """);

                resp = sc.nextInt();

                switch(resp) {
                    case 1:
                        System.out.print("Digite o valor de π: ");
                        pi = sc.nextDouble();                        System.out.print("Digite o valor do raio: ");
                        System.out.print("Digite o valor do raio: ");
                        raio = sc.nextDouble();
                        break;
                    case 2:
                        circ.calcularArea(pi, raio);
                        break;
                    case 3:
                        circ.calcularPerimetro(pi, raio);
                        break;
                    case 0:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opcao invalida");
                        break;
                }

            }

    }

}
