package lista9.atividade1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;


public class teste {
    public static void main(String[] args) {
        ArrayList<seguro> seguros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int opc = -1;

        while(opc != 0) {
            System.out.print("""
                    Escolha uma das opcoes abaixo:
                    1. Cadastrar um novo seguro
                    2. Listar todos os seguros cadastrados
                    3. Calcular o premio de um seguro(Buscar pelo nome)
                    4. Exibir o valor total dos premios de todos os seguros cadastrados
                    0. Sair
                    Resposta: """);
            opc = sc.nextInt();

            switch(opc) {
                case 1:
                    System.out.print("""
                        Digite o tipo do seguro:
                        1. Seguro automitivo
                        2. Seguro residencial
                        3. Seguro de vida
                        Resposta: """);
                    int resp = sc.nextInt();

                    System.out.print("Informe o codigo do seguro: ");
                    int cod = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Informe o nome do segurado: ");
                    String nomeSegurado = sc.nextLine();
                    System.out.print("Informe o valor segurado: ");
                    double valorSegurado = sc.nextDouble();
                    System.out.print("Informe o valor base do seguro: ");
                    double valorBase = sc.nextDouble();

                    if (resp == 1) {
                        seguroAutomotivo seguroAuto = new seguroAutomotivo(cod, nomeSegurado, valorSegurado, valorBase);
                        seguros.add(seguroAuto);
                    } else if (resp == 2) {
                        seguroResidencial seguroRes = new seguroResidencial(cod, nomeSegurado, valorSegurado, valorBase);
                        seguros.add(seguroRes);
                    } else if (resp == 3) {
                        System.out.print("Informe a idade do segurado: ");
                        int idade = sc.nextInt();
                        seguroVida vida = new seguroVida(cod, nomeSegurado, valorSegurado, valorBase, idade);
                        seguros.add(vida);
                    }

                case 2:
                    System.out.println("Seguros cadastrados:");
                    System.out.println("-----------------------------");
                    for (seguro s: seguros) {
                        System.out.println("Codigo: " + s.getCodigo());
                        System.out.println("Nome do segurado: " + s.getNomeSegurado());
                        System.out.println("Valor segurado: " + s.getValorSegurado());
                        System.out.println("Valor base: " + s.getValorBase());
                        System.out.println("Premio: " + s.calcularPremio());
                        System.out.println("-----------------------------");
                    }
                case 3:
                    System.out.print("Digite o nome do segurado para calcular o premio: ");
                    String nomeBusca = sc.next();
                    boolean encontrado = false;
                    for (seguro s: seguros) {
                        if (s.getNomeSegurado().equalsIgnoreCase(nomeBusca)) {
                            System.out.println("Premio do " + s.getNomeSegurado() + ": " + s.calcularPremio());
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Segurado nao encontrado!");
                    }
                case 4:
                    System.out.println("Valores dos premios de todos os seguros cadastrados:");
                    System.out.println("----------------------------------------------------");
                    for (seguro s: seguros) {
                        System.out.println("Premio do " + s.getNomeSegurado() + ": " + s.calcularPremio());
                        System.out.println("----------------------------------------------------");
                    }
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Valor informado está errado! Digite outr!");
                    break;
            }

        }

        sc.close();

    }
}
