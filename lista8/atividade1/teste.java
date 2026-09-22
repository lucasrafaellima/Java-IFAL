package lista8.atividade1;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);  
        
        ArrayList<seguro> s = new ArrayList<>();
        
        int opcao = -1;

        while (opcao != 0) {
            System.out.print("""
                    Digite uma das opcoes abaixo:
                    1. Cadastrar um novo seguro 
                    2. Listar todos os seguros cadastrados 
                    3. Calcular o prêmio de um seguro individual (Buscar pelo nome do cliente) 
                    4. Exibir o valor total dos prêmios de todos os seguros cadastrados; 
                    0. Sair do sistema.
                    Resposta: """);
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("""
                            Digite uma das opcoes: 
                            1- Residencial
                            2- Automotivo
                            3- Vida
                            Resposta: """);
                    int escolha = sc.nextInt();
                    System.out.print("Digite o codigo: ");
                    int codigo = sc.nextInt();
                    System.out.print("Digite o nome: ");
                    String nome = sc.next();
                    System.out.print("Digite o valor segurado: ");
                    double valorSegurado = sc.nextDouble();
                    System.out.print("Digite o valor seguro: ");
                    double valorSeguro = sc.nextDouble();
                    boolean sucesso = false;

                    if (escolha == 1) {
                        seguroResidencial residencial = new seguroResidencial(codigo, nome, valorSegurado, valorSeguro);
                        s.add(residencial);
                        sucesso = true;
                    } else if (escolha == 2) {
                        seguroAutomotivo automotivo = new seguroAutomotivo(codigo, nome, valorSegurado, valorSeguro);
                        s.add(automotivo);
                        sucesso = true;
                    } else if (escolha == 3) {
                        System.out.print("Digite a idade: ");
                        int idade = sc.nextInt();

                        seguroVida vida = new seguroVida(codigo, nome, valorSegurado, valorSeguro, idade);
                        s.add(vida);
                        sucesso = true;
                    }

                    if (sucesso == true) {
                        System.out.println("Segurado cadastrado!");
                    }
                    break;
                case 2:
                    for (seguro seg: s) {
                        System.out.println("Codigo: " + seg.getCodigo());
                        System.out.println("Nome: " + seg.getNome());
                        System.out.println("Valor segurado: " + seg.getValorSegurado());
                        System.out.println("Tipo do seguro: " + seg.getClass().getSimpleName());
                        System.out.println("Premio: " + seg.calcularPremio());
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = sc.next();
                    for (seguro seg: s) {
                        if (seg.getNome().equalsIgnoreCase(nomeCliente)) {
                            System.out.println("Tipo do seguro: " + seg.getClass().getSimpleName());
                            System.out.println("Valor do premio: " + seg.calcularPremio());
                        }
                    }
                    break;
                case 4:
                    double total = 0;
                    for (seguro seg: s) {
                        total += seg.calcularPremio();
                    }
                    System.out.println("Valor total de todos os premios: " + total);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Valor invalido! Digite novamente!");
                    break;

            }

        }

    }
}
