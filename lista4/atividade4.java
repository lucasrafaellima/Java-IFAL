package lista4;

import java.util.Scanner;
import java.util.Locale;

public class atividade4 {

    public int area(int b, int h) {
        return b * h;
    }

    public int perimetro(int b, int h) {
        return (2*b) + (2*h);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        atividade4 calc = new atividade4();

        System.out.print("Digite o valor da base: ");
        int base = sc.nextInt();
        System.out.print("Digite o valor da altura: ");
        int altura = sc.nextInt();

        int escolha = -1;

        while (escolha != 0) {
            System.out.print("Digite uma das opções: \n 1 - calcular area \n 2- calcular perimetro \n 0- sair \n resposta: ");
            escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("O valor da área é: " + calc.area(base, altura));
            } else if (escolha == 2) {
                System.out.println("O valor do perimetro é: " + calc.perimetro(base, altura));
            } else {
                System.out.println("Saindo do sistema!");
            }

        }

        sc.close();

    }    
}
