import java.util.Scanner;

public class atividade1 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite somente seu ano de nascimento: ");
        int nascimento = sc.nextInt();
        System.out.print("Digite o ano atual: ");
        int atual = sc.nextInt();
        int idade = atual - nascimento;
        System.out.println("Sua idade é: " + idade);

        sc.close();

    }
}