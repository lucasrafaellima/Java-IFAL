package lista7.atividade1;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int valor = -1;

        ArrayList<funcionario> funcionario = new ArrayList<>();
        ArrayList<gerente> gerente = new ArrayList<>();
        

        while (valor != 0) {
            System.out.print("""
                    Escolha uma das opções abaixo:
                    1. Adicionar Funcionário
                    2. Adicionar Gerente
                    3. Obter salário de um Funcionário
                    4. Obter salário de um Gerente
                    0. Sair
                    Resposta: """);
            valor = sc.nextInt();

            switch(valor) {
                case 1:
                    System.out.print("Digite o nome do funcionário: ");
                    String nomeFuncionario = sc.next();
                    System.out.print("Digite o CPF do funcionário: ");
                    String cpfFuncionario = sc.next();
                    System.out.print("Digite a data de nascimento do funcionário: ");
                    String nascimentoFuncionario = sc.next();
                    System.out.print("Digite o salário do funcionário: ");
                    double salarioFuncionario = sc.nextDouble();
                    funcionario.add(new funcionario(nomeFuncionario, cpfFuncionario, nascimentoFuncionario, salarioFuncionario));
                    System.out.println("Funcionario " + nomeFuncionario + " adicionado!");
                    break;
                case 2:
                    System.out.print("Digite o nome do gerente: ");
                    String nomeGerente = sc.next();
                    System.out.print("Digite o CPF do gerente: ");
                    String cpfGerente = sc.next();
                    System.out.print("Digite a data de nascimento do gerente: ");
                    String nascimentoGerente = sc.next();
                    System.out.print("Digite o salario do gerente: ");
                    double salarioGerente = sc.nextDouble();
                    System.out.print("Digite o departamento do gerente: ");
                    String departamentoGerente = sc.next();
                    gerente.add(new gerente(nomeGerente, cpfGerente, nascimentoGerente, salarioGerente, departamentoGerente));
                    System.out.println("Gerente " + nomeGerente + " adicionado!");
                    break;
                case 3:
                    System.out.print("Digite o nome do funcionario para obter o salario: ");
                    String buscaNome = sc.next();
                    boolean encontrado = false;

                    for (funcionario f : funcionario) {
                        if (f.getNome().equals(buscaNome) && f instanceof funcionario) {
                            System.out.println("Salário do funcionário " + buscaNome + ": " + f.getSalario());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Funcionário não encontrado!");
                    }
                    break;
                case 4:
                    System.out.print("Digite o nome do gerente para obter o salario: ");
                    String buscaGerente = sc.next();
                    boolean encontradoGerente = false;
                    
                    for (gerente g : gerente) {
                        if (g.getNome().equalsIgnoreCase(buscaGerente) && g instanceof gerente) {
                            System.out.println("Salario do gerente " + buscaGerente + ": " + g.getSalario());
                            encontradoGerente = true;
                        }
                    }

                    if (!encontradoGerente) {
                        System.out.println("Gerente não encontrado!");
                    }

                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        }

    }
}
