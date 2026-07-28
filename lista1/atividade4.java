package lista1;
import java.util.Scanner;
public class atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("numero maior: " + num1);
        } else {
            System.out.println("Numero maior: " + num2);
        }

        sc.close();

    }
}
