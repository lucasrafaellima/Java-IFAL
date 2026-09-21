package lista7.atividade2;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ArrayList<contaCorrente> corrente = new ArrayList<>();
        ArrayList<contaPoupanca> poupanca = new ArrayList<>();
        ArrayList<conta> conta = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {
            System.out.print("""
                1. Cadastrar Conta corrente
                2. Cadastrar Poupança
                3. Verificar saldo de uma Conta
                4. Efetuar saque em uma Conta
                5. Executar a rotina de atualização em todas as contas
                0. Sair
                Resposta: """);
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Informe o numero da conta: ");
                    int numConta = sc.nextInt();
                    System.out.print("Informe o CPF do titular: ");
                    String cpf = sc.next();
                    System.out.print("Informe o saldo da conta: ");
                    double saldo = sc.nextDouble();
                    System.out.print("Informe a taxa da conta: ");
                    double taxa = sc.nextDouble();
                    System.out.print("Informe o banco da conta: ");
                    String banco = sc.next();

                    corrente.add(new contaCorrente(numConta, cpf, saldo, taxa, banco));

                    System.out.println("Cliente do cpf " + cpf + " cadastrado com sucesso!");

                    break;
                case 2:
                    System.out.print("Informe o numero da conta: ");
                    int numConta1 = sc.nextInt();
                    System.out.print("Informe o CPF do titular: ");
                    String cpf1 = sc.next();
                    System.out.print("Informe o saldo da conta: ");
                    double saldo1 = sc.nextDouble();
                    System.out.print("Informe a taxa da conta: ");
                    double taxa1 = sc.nextDouble();
                    System.out.print("Informe o banco da conta: ");
                    String banco1 = sc.next();

                    poupanca.add(new contaPoupanca(numConta1, cpf1, saldo1, taxa1, banco1));

                    System.out.println("Cliente do cpf " + cpf1 + " cadastrado com sucesso!");

                    break;
                case 3:
                    System.out.print("Informe o CPF do titular: ");
                    String buscacpf = sc.next();

                    for (conta c : conta) {
                        if (c.getCpf().equals(buscacpf)) {
                            if (c instanceof contaCorrente) {
                                System.out.println("Conta do tipo Corrente:");
                            } else if (c instanceof contaPoupanca) {
                                System.out.println("Conta poupança encontrada!");

                            }
                            System.out.println("Saldo da conta: " + c.getSaldo());
                        }
                    }

                    break;
                case 4:
                    System.out.print("Informe o CPF do titular: ");
                    String buscacpf2 = sc.next();
                    for (contaCorrente cc : corrente) {
                        if (cc.getCpf().equals(buscacpf2)) {
                            System.out.println("Saldo da conta: " + cc.getSaldo());
                            System.out.print("Informe o valor do saque: ");
                            double valorSaque = sc.nextDouble();
                            cc.saque(valorSaque);
                            System.out.println("Valor atual: " + cc.getSaldo());
                        } else {
                            for (contaPoupanca cp : poupanca) {
                                if (cp.getCpf().equals(buscacpf2)) {
                                    System.out.println("Saldo da conta: " + cp.getSaldo());
                                    System.out.print("Informe o valor do saque: ");
                                    double valorSaque = sc.nextDouble();
                                    cp.saque(valorSaque);
                                    System.out.println("Valor atual: " + cp.getSaldo());
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Contas atualizadas: ");
                    for (conta c : conta) {
                        c.atualizarSaldo();
                        System.out.println(c.getSaldo());
                    }

                    System.out.println("Contas correntes atualizadas: ");
                    for (contaCorrente cc : corrente) {
                        cc.atualizarSaldo();
                        System.out.println(cc.getSaldo());
                    }

                    System.out.println("Contas poupancas atualizadas: ");
                    for (contaPoupanca cp : poupanca) {
                        cp.atualizarSaldo();
                        System.out.println(cp.getSaldo());
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;

            }

        }

    }
}
