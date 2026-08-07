import java.util.Scanner;
import java.util.Locale;

public class atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int[] valor = new int[10];
        int soma =0;

        for (int i =0; i < valor.length; i++) {
            System.out.print("Digite o valor de numero " + (i+1) + ": ");
            valor[i] = sc.nextInt();           
        }

        for ( int i = 0; i < valor.length; i++) {
            soma = soma + valor[i];
        }

        System.out.println("A soma dos valores digitados é: " + soma);

        sc.close();

    }
}