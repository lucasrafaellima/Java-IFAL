package lista6.atividade2;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class teste {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ArrayList<cliente> c = new ArrayList<>();
        ArrayList<contaPoupanca> poupanca = new ArrayList<>();
        ArrayList<contaCorrente> corrente = new ArrayList<>();

        int valor = -1;

        while (valor != 0) {
            System.out.print("""
                    Escolha uma das opcoes abaixo:
                    1. Cadastrar Cliente (Incluindo Conta corrente e Poupança)
                    2. Saque da conta corrente (Procurar pelo CPF do Cliente)
                    3. Saque da poupança (Procurar pelo CPF do Cliente)
                    4. Depósito da conta corrente (Procurar pelo CPF do Cliente)
                    5. Depósito da poupança (Procurar pelo CPF do Cliente)
                    0. Sair
                    Resposta: """);   
            valor = sc.nextInt();
            
            switch(valor) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 0:
                    System.out.println("Saindo do sistema...");
                default:
                    System.out.println("Opcao errada, tente de novo!");
            }

        }

    }

}
