import java.util.Scanner;
import java.util.Locale;

public class atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantas pessoas voce deseja cadastrar: ");
        int quant = sc.nextInt();

        String[] pessoa = new String[quant];
        int count =0;

        for (int i =0; i < pessoa.length; i++) {
            System.out.print("Digite o nome da pessoa " + (i+1) + ": ");
            pessoa[i] = sc.next();
        }

        System.out.print("Digite o nome da pessoa que deseja buscar: ");
        String nome = sc.next();

        for (int i =0; i < pessoa.length; i++) {
            if (pessoa[i].equals(nome)) {
                System.out.println("Pesssoa com nome " + pessoa[i] + " encontrada!");
                break;
            } else {
                count++;
            }
        }

        if (count == pessoa.length) {
            System.out.println("Pessoa com nome " + nome + " não encontrada!");
        }

        sc.close();

    }
}
