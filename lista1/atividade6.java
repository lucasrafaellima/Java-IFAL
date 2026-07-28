package lista1;

import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu peso: ");
        Double peso = sc.nextDouble();
        System.out.print("Digite a sua altura: ");
        Double altura = sc.nextDouble();

        Double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        sc.close();

    }
}
