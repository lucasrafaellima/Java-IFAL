import java.util.Scanner;
import java.util.Locale;

public class atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        int count =0;

        for (int i =0;i < vet1.length; i++) {
            System.out.print("Digite o numero do vet1["+ i + "]: ");
            vet1[i] = sc.nextInt();
            System.out.print("Digite o numero do vet2["+ i + "]: ");
            vet2[i] = sc.nextInt();
        }

        for (int i =0; i < vet1.length; i++) {
            if (vet1[i] == vet2[i]) {
            count++;
            }
        }

        if (count == 5) {
            System.out.println("Os vetores são iguais!");
        } else {
            System.out.println("Os vetores são diferentes!");
        }

        sc.close();

    }    
}