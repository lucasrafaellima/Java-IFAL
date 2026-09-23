package lista8.atividade2;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ArrayList<planoAcademia> plano = new ArrayList<>();
        int opc = -1;

        while (opc != 0) {
            System.out.print("""
                    1. Cadastrar um novo plano (básico, premium ou VIP);
                    2. Listar todos os planos cadastrados (exibindo cliente, idade, valor base, tempo
                    de contrato e mensalidade calculada)
                    3. Calcular a mensalidade de um cliente individual (buscar pelo nome do cliente)
                    4. Exibir a arrecadação mensal total da academia
                    5. Simular o valor da mensalidade entre os diferentes tipos de plano utilizando os
                    mesmos dados do cliente
                    0. Sair do sistema.
                    Resposta: """);
            opc = sc.nextInt();

            switch(opc) {
                case 1:
                    int escolha =0;
                    System.out.print("""
                            Informe a opcao que deseja cadastrar: 
                            1- basico
                            2- premium
                            3- vip
                            Resposta: """);
                    escolha = sc.nextInt();
                    System.out.print("Informe o codigo: ");
                    int codigo = sc.nextInt();
                    System.out.print("Informe o nome: ");
                    String nome = sc.next();
                    System.out.print("Infome a idade: ");
                    int idade = sc.nextInt();
                    System.out.print("Informe o valor base: ");
                    double valorBase = sc.nextDouble();
                    System.out.print("Informe o periodo de contrato: ");
                    int periodoContrato = sc.nextInt();

                    if (escolha == 1) {
                        planoBasico basico = new planoBasico(codigo, nome, idade, valorBase, periodoContrato);
                        plano.add(basico);
                    } else if (escolha == 2) {
                        planoPremium premium = new planoPremium(codigo, nome, idade, valorBase, periodoContrato);
                        plano.add(premium);
                    } else if (escolha == 3) {
                        planoVip vip = new planoVip(codigo, nome, idade, valorBase, periodoContrato);
                        plano.add(vip);
                    }

                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    for (planoAcademia p: plano) {
                        System.out.println("-------------------------");
                        System.out.println("Plano: " + p.getClass().getSimpleName());
                        System.out.println("codigo do cliente: " + p.getCodigo());
                        System.out.println("Nome do cliente: " + p.getNomeCliente());
                        System.out.println("Idade: " + p.getIdade());
                        System.out.println("Valor base: " + p.getValorBase());
                        System.out.println("Tempo de contrato: " + p.getPeriodoContrato());
                        System.out.println("Mensalidade calculada: " + p.calcularMensalidade());
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do cliente: ");
                    String buscaNome = sc.next();
                    for (planoAcademia p : plano) {
                        if (p.getNomeCliente().equalsIgnoreCase(buscaNome)) {
                            System.out.println("O plano é: " + p.getClass().getSimpleName());
                            System.out.println("Valor da mensalidade: R$" + p.calcularMensalidade());
                        }
                    }
                    break;
                case 4:
                    double total = 0;
                    for (planoAcademia p: plano) {
                        total = total + p.calcularMensalidade();
                    }
                    System.out.println("Valor da arrecadacao mensal: " + total);
                    break;
                case 5:
                    System.out.print("Informe a idade: ");
                    int idade1 = sc.nextInt();
                    System.out.print("Digite o periodo de contrato em meses: ");
                    int periodo = sc.nextInt();
                    System.out.print("Informe o valor base: ");
                    double valorBase1 = sc.nextDouble();


                    planoBasico basico = new planoBasico(0, "Simulacao", idade1, valorBase1, periodo);
                    planoPremium premium = new planoPremium(0, "Simulacao", idade1, valorBase1, periodo);
                    planoVip vip = new planoVip(0, "Simulacao", idade1, valorBase1, periodo);

                    System.out.println("Plano basico: " + basico.calcularMensalidade());
                    System.out.println("Plano premium: " + premium.calcularMensalidade());
                    System.out.println("Plano Vip: " + vip.calcularMensalidade());

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opcao errada! Digite uma nova!");
                    break;
            }

        }

    }
}
