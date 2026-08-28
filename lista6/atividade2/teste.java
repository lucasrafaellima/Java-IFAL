package lista6.atividade2;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class teste {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ArrayList<cliente> cliente = new ArrayList<>();

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
                    System.out.print("Digite o nome: ");
                    String nome = sc.next();
                    System.out.print("Digite o CPF: ");
                    int cpf = sc.nextInt();

                    //conta corrente
                    System.out.print("Informe o numero da conta corrente: ");
                    int numCorrente = sc.nextInt();
                    System.out.print("Informe a taxa: ");
                    double taxa = sc.nextDouble();
                    System.out.print("Informe o saldo: ");
                    double saldo = sc.nextDouble();
                    System.out.print("Informe o nome do banco: ");
                    String banco = sc.next();

                    //conta poupanca
                    System.out.print("Informe o numero da conta poupanca: ");
                    int numPoupanca = sc.nextInt();
                    System.out.print("Informe a taxa: ");
                    double taxa2 = sc.nextDouble();
                    System.out.print("Informe o saldo: ");
                    double saldo2 = sc.nextDouble();
                    System.out.print("Informe nome do banco: ");
                    String banco2 = sc.next();
                
                    contaCorrente corrente = new contaCorrente(numCorrente, taxa, saldo, banco);
                    contaPoupanca poupanca = new contaPoupanca(numPoupanca, taxa2, saldo2, banco2);
                    cliente.add(new cliente(nome, cpf, corrente, poupanca));

                    System.out.println("Cliente " + nome + " cadastrado com sucesso!");

                    break;

                case 2:
                    System.out.print("Informe o cpf do cliente: ");
                    int buscacpf = sc.nextInt();
                    boolean encontrado = false;
                    for (cliente c: cliente) {
                        if (c.getCpf() == buscacpf) {
                            System.out.print("Digite a quantidade que deseja sacar da conta corrente: ");
                            double v = sc.nextDouble();
                            c.getContaCorrente().sacar(v);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Cliente não encontrado!");
                    }
                    break;
                case 3:
                    System.out.print("Informe o cpf do cliente: ");
                    int buscacpf2 = sc.nextInt();
                    boolean encontrado1 = false;
                    for (cliente c: cliente) {
                        if (c.getCpf() == buscacpf2) {
                            System.out.print("Digite a quantidade de deseja sacar da conta poupanca: ");
                            double v2 = sc.nextDouble();
                            c.getContaPoupanca().sacar(v2);
                            encontrado1 = true;
                        }
                    }
                    if (!encontrado1) {
                        System.out.println("Cliente não encontrado!");
                    }
                    break;
                case 4:
                    System.out.print("Digite o cpf do cliente: ");
                    int buscacpf3 = sc.nextInt();
                    boolean encontrado3 = false;
                    for (cliente c: cliente) {
                        if (c.getCpf() == buscacpf3) {
                            System.out.print("Informe quanto deseja depositar na conta corrente: ");
                            double v2 = sc.nextDouble();
                            c.getContaCorrente().depositar(v2);
                            encontrado3 = true;
                        }
                    }
                    if (!encontrado3) {
                        System.out.println("Cliente não encontrado!");
                    }

                    break;
                case 5:
                    System.out.print("Digite o cpf do cliente: ");
                    int buscacpf4 = sc.nextInt();
                    boolean encontrado4 = false;
                    for (cliente c: cliente) {
                        if (c.getCpf() == buscacpf4) {
                            System.out.print("Informe o valor que deseja depositar na conta poupanca: ");
                            double v3 = sc.nextDouble();
                            c.getContaPoupanca().depositar(v3);
                            encontrado4 = true;
                        }
                    }
                    if (!encontrado4) {
                        System.out.println("Cliente não encontrado!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opcao errada, tente de novo!");
                    break;
            }

        }
        sc.close();

    }

}
