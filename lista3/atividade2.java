import java.util.Scanner;
import java.util.Locale;

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double[] valor = new double[10];
        double menor =0;
        double maior =0;
        double media =0;
        double soma =0;


        for ( int i=0; i < valor.length; i++) {
            System.out.print("Digite o valor de numero " + (i+1) + ": ");
            valor[i] = sc.nextInt();
        }

        for (int i =0; i < valor.length; i++) {
            if (i == 0) {
                menor = valor[i];
                maior = valor[i];
            } else if (valor[i] < menor) {
                menor = valor[i];
            } else if (valor[i] > maior) {
                maior = valor[i];
            }

            soma = soma + valor[i];

        }

        media = soma / valor.length;

        System.out.println("O menor valor digitado é: " + menor);
        System.out.println("O maior valor digitado é: " + maior);
        System.out.println("A media dos valores digitados é: " + media);

        sc.close();
    }    
}