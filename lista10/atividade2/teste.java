package lista10.atividade2;

import java.util.Locale;

java.util.Scanner;
java.util.Locale;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        circulo circ = new circulo();
        int resp = -1;

        while(resp != 0) {
            System.out.print("""
                1 – Digitar valor de π e r
                2 – Calcular Área
                3 – Calcular Perímetro
                0 - Sair
                Resposta: """);

                resp = sc.nextInt();

            }

    }

}
