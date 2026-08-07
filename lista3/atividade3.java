import java.util.Scanner;
import java.util.Locale;

public class atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double[] nota = new double[10];
        int somaAprovados = 0;
        double soma =0;
        double media =0;

        for (int i =0; i < nota.length; i++) {
            System.out.print("Digite a nota do aluno " + (i+1) + ": ");
            nota[i] = sc.nextDouble();
            if (nota[i] >= 6) {
                somaAprovados++; 
            }
            soma = soma + nota[i];

        }

        media = soma / nota.length;

        System.out.println("A quantidade de alunos aprovados é: " + somaAprovados);
        System.out.println("A quantidade de alunos reprovados é: " + (nota.length - somaAprovados));
        System.out.println("Media das notas da turma é: " + media);
        sc.close();

    }
}