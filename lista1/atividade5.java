package lista1;
import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da base do retangulo: ");
        Double base = sc.nextDouble();
        System.out.print("Digite o valor da altura do retangulo: ");
        Double altura = sc.nextDouble();

        Double area = base * altura;
        System.out.println("Area do retangulo: " + area);

        double perimetro = (base * 2) + (altura * 2);
        System.out.println("Perimetro do retangulo: " + perimetro);

        sc.close();

    }
}
