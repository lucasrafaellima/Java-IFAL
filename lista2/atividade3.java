import java.util.Scanner;
import java.util.Locale;

public class atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Integer count;
        Double altura;
        Double totalAltura = 0.0;


        for (count = 0; count < 10; count++) {
            System.out.print("Digite a altura da pessoa " + (count+1) + ": ");
            altura = sc.nextDouble();
            totalAltura = totalAltura + altura;

        }

        System.out.println("A media das alturas e: " + (totalAltura / 10.0));

        sc.close();

    }
}