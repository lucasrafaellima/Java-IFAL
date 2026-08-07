import java.util.Scanner;
import java.util.Locale;
public class atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int count = 0;
        int idade = 0;
        int parametro = 0;
        int valor = 0;
        int media = 0;

        while (valor != -1) {
            System.out.print("Digite a idade de numero " + (count+1) + ": ");
            parametro = sc.nextInt();
            idade = idade + parametro;
            count = count + 1;
            media = idade / count;
            System.out.print("Deseja continuar?[-1 para sair]: ");
            valor = sc.nextInt();
        }

        System.out.println("A media de idades é: " + media);
        sc.close();

    }

}
