package lista4;

import java.util.Scanner;
import java.util.Locale;

public class atividade7 {

    public double gabarito(String a, String b, String c, String d, String e) {
        double nota = 0;

        if (a.equalsIgnoreCase("a")) {
            nota = nota + 1;
        } 
        if (b.equalsIgnoreCase("b")) {
            nota = nota + 1;
        } 
        if (c.equalsIgnoreCase("d")) {
            nota = nota + 3;
        }
        if (d.equalsIgnoreCase("e")) {
            nota = nota + 2.5;
        }
        if (e.equalsIgnoreCase("c")) {
            nota = nota + 2.5;
        }

        return nota;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        atividade7 gabarito = new atividade7();

        String[] resp = new String[5];

        System.out.print("Questão 1 - 2+2=? \n a) 4 \n b) 6 \n resposta: ");
        resp[0] = sc.next();
        System.out.print("Questão 2 - 5*6=? \n a) 15 \n b) 30 \n resposta: ");
        resp[1] = sc.next();
        System.out.print("Questão 3 - 24-10=? \n c) 17 \n d) 14 \n resposta: ");
        resp[2] = sc.next();
        System.out.print("Questão 4 - 35/7=? \n d) 9 \n e) 5 \n resposta: ");
        resp[3] = sc.next();
        System.out.print("Questão 5 - 105-30=? \n a) 1 \n c) 75 \n resposta: ");
        resp[4] = sc.next();

        System.out.println("Sua nota é: " + gabarito.gabarito(resp[0], resp[1], resp[2], resp[3], resp[4]));

    }
}
