package lista5;

import java.util.ArrayList;
import java.util.Scanner;

public class IMC {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Pessoa> listaDados = new ArrayList<>(); 

    public static String cadastrarIMC() {
        System.out.print("Digite o nome:");
        String nome = sc.next();
        System.out.print("Digite o peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();
        Pessoa p = new Pessoa.add(nome, peso, altura);
    }

}
