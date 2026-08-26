package lista6.atividade1;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ArrayList<aluno> a = new ArrayList<>();
        ArrayList<professor> p = new ArrayList<>();

        int valor = -1;

        while (valor != 0) {
            System.out.print("""
                    1. Cadastrar Aluno
                    2. Cadastrar Professor
                    3. Obter Média do aluno
                    4. Obter informações do Aluno
                    5. Obter informações do professor
                    0. Sair
                    Resposta: 
                    """);
            valor = sc.nextInt();

            switch(valor) {
                case 1:
                    System.out.print("Informe o nome do aluno: ");
                    String nome = sc.next();
                    System.out.print("Digite o CPF do aluno: ");
                    int cpf = sc.nextInt();
                    System.out.print("Digite a data de nascimento do aluno: ");
                    String nascimento = sc.next();
                    System.out.print("Informe a primeira nota do aluno: ");
                    double nota1 = sc.nextDouble();
                    System.out.print("Informe a segunda nota do aluno: ");
                    double nota2 = sc.nextDouble();
                    System.out.print("Informe a terceira nota do aluno: ");
                    double nota3 = sc.nextDouble();
                    System.out.print("Informe a quarta nota do aluno: ");
                    double nota4 = sc.nextDouble();
                    aluno aluno = new aluno(nome, cpf, nascimento, nota1, nota2, nota3, nota4);
                    a.add(aluno);
                    System.out.println("Dados do aluno " + aluno.getNome() + " cadastrados!");
                    break;
                case 2:
                    System.out.print("Informe o nome do professor: ");
                    String nomeProfessor = sc.next();
                    System.out.print("Digite o CPF do aluno: ");
                    int cpfProfessor = sc.nextInt();
                    System.out.print("Digite a data de nascimento do aluno: ");
                    String nascimentoProfessor = sc.next();
                    System.out.print("Digite o salario do professor: ");
                    double salario = sc.nextDouble();
                    professor professor = new professor(nomeProfessor, cpfProfessor, nascimentoProfessor, salario);
                    p.add(professor);
                    System.out.println("Professor " + professor.getNome() + " cadastrado!");
                    break;
                case 3:
                    if (a.isEmpty()) {
                        System.out.println("Não existe nenhum aluno cadastrado!");
                    } else {
                        System.out.print("Digite o CPF do aluno para encontrar: ");
                        int procurarcpf = sc.nextInt();
                        boolean encontrado = false;

                        for (aluno alu : a) {
                            if (alu.getCpf() == procurarcpf) {
                                System.out.println("A media do aluno " + alu.getNome() + " é: " + alu.media());
                                encontrado = true;
                                break;
                            }

                        }

                        if (!encontrado) {
                                System.out.println("Aluno não encontrado!");
                            }

                    }
                    break;
                case 4:
                    if (a.isEmpty()) {
                        System.out.println("Não existe cadastro de alunos!");
                    } else {
                        System.out.println("Informacoes dos alunos:");
                        for (aluno alu : a) {
                                alu.exibirInformacoes();
                                System.out.println("--------------------------");
                        }

                    }
                    break;
                case 5:
                    if (p.isEmpty()) {
                        System.out.println("Nenhum professor cadastrado!");
                    } else {
                        System.out.println("Informacoes dos professores: ");
                        for (professor prof : p) {
                                prof.exibirInformacoes();
                                System.out.println("--------------------------");
                        }

                    }

                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Campo nao está correto!");
                    break;
            }
        }

        sc.close();

    }    
}
