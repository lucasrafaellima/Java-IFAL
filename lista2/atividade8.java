package org.example;

import java.util.Scanner;
import java.util.Locale;

public class atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int valor = -1;
        int count = 0;
        int num = 0;

        while (valor != 0) {
            System.out.print("Digite o valor de numero " + (count+1) + ": ");
            int ispar = sc.nextInt();
            count = count + 1;
            if (ispar % 2 == 0) {
                num = num + 1;
            }
            System.out.println("Deseja sair?[0 para sim]: ");
            valor = sc.nextInt();
        }

        System.out.println("A quantidade de numeros pares é: " + num);

        sc.close();

    }
}
