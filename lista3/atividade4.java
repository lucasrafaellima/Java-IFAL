import java.util.Scanner;
import java.util.Locale;

public class atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int[] num = new int[10];

        for (int i =0; i < num.length; i++) {
            System.out.print("Digite o numero da ordem " + (i+1) + ": ");
            num[i] = sc.nextInt();
        }

        for (int i = num.length; i > 0; i--) {
            System.out.println("O numero da ordem inversa " + (i) + " é: " + num[i-1]);
       }
       sc.close();
    }
}