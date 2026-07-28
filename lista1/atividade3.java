package lista1;
import java.util.Scanner;

public class atividade3 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a altura da primeira pessoa: ");
        Double altura1 = sc.nextDouble();
        System.out.print("Digite a altura da segunda pessoa: ");
        Double altura2 = sc.nextDouble();
        System.out.print("Digite a altura da terceira pessoa: ");
        Double altura3 = sc.nextDouble();

        Double media = (altura1 + altura2 + altura3) / 3;

        System.out.print("Media de altura: " + media);

        sc.close();
    }
}