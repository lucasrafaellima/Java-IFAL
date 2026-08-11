package lista4;

import java.util.Scanner;
import java.util.Locale;

public class atividade2 {

    public int somar(int n1, int n2) {
        return n1 + n2;
    }

    public int subtrair(int n1, int n2) {
        return n1 - n2;
    }

    public int mutiplicar(int n1, int n2) {
        return n1 * n2;
    }

    public int dividir(int n1, int n2) {
        return n1 / n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        atividade2 calc = new atividade2();

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = sc.nextInt();

        System.out.print("Digite as opcoes abaixo\n"
                + "1 - somar\n"
                + "2 - subtrair\n"
                + "3 - multiplicar\n"
                + "4 - dividir\n"
                + "Resposta: ");
        int resposta = sc.nextInt();

        switch(resposta) {
            case 1: 
                System.out.println("A soma é: " + calc.somar(num, num2));
                break;
            case 2:
                System.out.println("A subtracao é: " + calc.subtrair(num, num2));
                break;
            case 3:
                System.out.println("A multiplicacao é: " + calc.mutiplicar(num, num2));
                break;
            case 4:
                System.out.println("A subtracao é: " + calc.subtrair(num, num2));
                break;
            default:
                System.out.println("O valor informado não está correto!");
                break;
        }

        sc.close();

    }
}
