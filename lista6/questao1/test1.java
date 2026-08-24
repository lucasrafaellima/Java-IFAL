package lista6.questao1;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ArrayList<aluno> a = new ArrayList<>();
        ArrayList<professor> p = new ArrayList<>();

        int valor = -1;

        while (valor != 0) {
            System.out.print("""
                    1. Cadastrar Aluno
                    2. Cadastrar Professor
                    3. Obter Média do aluno
                    4. Obter informações do Aluno
                    5. Obter informações do professor
                    0. Sair
                    Resposta: 
                    """);
            valor = sc.nextInt();

            switch(valor) {
                case 1:
                    System.out.print("Informe o nome do aluno: ");
                    
                case 2:
                case 3:
                case 4:
                case 5:
                case 0:
                    System.out.println("Saindo do sistema...");
                default:
                    System.out.println("Campo nao está correto!");
            }
        }

    }    
}
