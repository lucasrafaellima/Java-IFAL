import java.util.Scanner;
import java.util.Locale;

public class atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int num = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o numero " + (i+1) + ": ");
            int valor = sc.nextInt();
            if ( i == 0 ) {
                num = valor;
            } else if ( num > valor ) {
                num = valor;
            }
        }

        System.out.println("O menor valor é: " + num);
        sc.close();
    }
}