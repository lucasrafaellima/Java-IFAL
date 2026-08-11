package lista4;

import java.util.Scanner;
import java.util.Locale;

public class atividade1 {
    public static int parimpar(int n) {
        return n % 2 == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        if (parimpar(num) == 1) {
            System.out.println("O numero " + num + " é par!");
        } else {
            System.out.println("O numero " + num + " é impar!");
        }

        sc.close();
    }
}
