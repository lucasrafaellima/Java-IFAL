package lista4;

import java.util.Scanner;
import java.util.Locale;

public class atividade6 {

    public void mostrar(double a, double b, double c, double d) {
        System.out.println("Primeira nota: " + a);
        System.out.println("Primeira nota: " + b);
        System.out.println("Primeira nota: " + c);
        System.out.println("Primeira nota: " + d);
    }

    public double media(double a, double b, double c, double d) {
        double media = (a + b + c + d);
        return media;
    }

    public void status(double media) {
        if (media < 4) {
            System.out.println("Reprovado!");
        } else if(media < 6) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Aprovado!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        atividade6 dados = new atividade6();

        double[] notas = new double[4];

        for (int i =0; i < notas.length; i++) {
            System.out.print("Digite a nota de ordem " + i + ": ");
            notas[i] = sc.nextDouble();
        }

        int valor = -1;

        while (valor != 0) {
            System.out.print("Digite uma das opções abaixo: \n 1- Informar notas do estudante \n 2- Informar media do estudante 3- Consultar status do estudante \n 0- Sair: ");
            valor = sc.nextInt();
            switch(valor) {
                case 1:
                    dados.mostrar(notas[0], notas[1], notas[2], notas[3]);                   
                    break; 
                case 2:
                    System.out.println("A media do estudante é: " + dados.media(notas[0], notas[1], notas[2], notas[3]));
                    break;
                case 3: 
                    dados.status(dados.media(notas[0], notas[1], notas[2], notas[3]));
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Valor invalido!");
                    break;
            }
        }
        sc.close();

    }    
}
