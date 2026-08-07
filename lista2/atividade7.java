import java.util.Scanner;
import java.util.Locale;

public class atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a quantidade: ");
        int quant = sc.nextInt();
        int menor = 0;
        int maior = 0;
        int num;

        for (int i =0; i < quant; i++) {
            System.out.print("Digite o valor de numero " + i + ": ");
            num = sc.nextInt();

            if (i == 0) {
                maior = num;
                menor = num;
            } else if (num > maior) {
                maior = num;
            } else if (num < menor) {
                menor = num;
            }

        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

        sc.close();

    }
}
