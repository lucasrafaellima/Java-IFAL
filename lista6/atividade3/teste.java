package lista6.atividade3;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ArrayList<funcionario> func = new ArrayList<>();
        ArrayList<gerente> ger = new ArrayList<>();

        int valor = -1;

        while (valor != 0) {
            System.out.print("""
                    1. Adicionar Funcionário
                    2. Adicionar Gerente
                    3. Listar todos os funcionários
                    4. Mostrar o salário do gerente (procurar pelo CPF)
                    0. Sair
                    Respota: """);

            valor = sc.nextInt();

            switch(valor) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = sc.next();
                    System.out.print("Digite o cpf do funcionario: ");
                    int cpf = sc.nextInt();
                    System.out.print("Digite o salario do funcionario: ");
                    double salario = sc.nextDouble();
                    System.out.print("Digite a data de nascimento: ");
                    String nascimento = sc.next();

                    func.add(new funcionario(nome, cpf, salario, nascimento));
                    System.out.println("Funcionario " + nome + " cadastrado!");

                    break;
                case 2:
                    System.out.print("Digite o nome: ");
                    String nome1 = sc.next();
                    System.out.print("Digite o cpf do gerente: ");
                    int cpf1 = sc.nextInt();
                    System.out.print("Digite o salario do gerente: ");
                    double salario1 = sc.nextDouble();
                    System.out.print("Digite a data de nascimento: ");
                    String nascimento1 = sc.next();

                    ger.add(new gerente(nome1, cpf1, salario1, nascimento1));
                    System.out.println("Gerente " + nome1 + " cadastrado!");

                    break;
                case 3:
                    System.out.println("Lista de funcionarios:");
                    for (funcionario f : func) {
                        f.exibirInformacoes();
                        System.out.println("--------------------------");                                              
                    }
                    break;
                case 4:
                    System.out.print("Digite o cpf do gerente: ");
                    int buscarcpf = sc.nextInt();
                    boolean encontrado = false;
                    for (gerente g : ger) {
                        if (g.getCpf() == buscarcpf && g instanceof gerente) {
                            g.calcularSalario();
                            encontrado = true;                            
                        } else {
                            System.out.println("O cpf informado não é de um gerente!");
                        }
                    }
                    if (!encontrado) {
                        System.out.println("cpf não encontrado!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opcao inválida!");
                    break;
            }
        }

        sc.close();

    }
}
