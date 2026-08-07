import java.util.Scanner;
import java.util.Locale;

public class atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int num = 0;

        for (int count =0; count < 10; count++) {
            System.out.print("Digite o numero " + count + ": ");
            int num2 = sc.nextInt();
            if (num2 > num) {
                num = num2;
            }
        }
        System.out.println("Maior numero digitado: " + num);
        sc.close();
    }
}
