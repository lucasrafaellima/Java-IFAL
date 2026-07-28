package lista1;

import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int num2 = sc.nextInt();

        System.out.print("Escolha uma das opções abaixo: \n 1. Retornar a soma entre dois números;\r\n" + //
        "2. Retornar a subtração entre dois números;\r\n" + //
        "3. Retornar a multiplicação entre dois números;\r\n" + //
        "4. Retornar a divisão entre dois números:");

        switch (sc.nextInt()) {
            case 1:
                System.out.println("Soma: " + (num1+num2));
                break;
            case 2: 
                System.out.println("Subtração: " + (num1-num2));
                break;
            case 3:
                System.out.println("Multiplicação: " + (num1*num2));
                break;
            case 4:
                System.out.println("Divisão: " + (num1/num2));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        
        }

        sc.close();

    }
}
