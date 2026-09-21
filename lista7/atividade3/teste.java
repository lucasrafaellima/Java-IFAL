package lista7.atividade3;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ArrayList<trabalhadorHorista> horista = new ArrayList<>();
        ArrayList<trabalhadorIntegral> integral = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {
            System.out.print("""
                    Digite uma opcao: 
                    1 Cadastrar trabalhador Integral
                    2 Cadastrar trabalhador Horista
                    3 Obter salário de um trabalhador (buscar pela matrícula)
                    4 Obter dados de um trabalhador (buscar pela matrícula)
                    5 Obter maior salário entre os trabalhadores integrais
                    6 Obter maior idade entre os trabalhadores horistas
                    0 Sair
                    Resposta: """);

            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Informe a matricula: ");
                    int matricula = sc.nextInt();
                    System.out.print("Informe o nome: ");
                    String nome = sc.next();
                    System.out.print("Informe o salario: ");
                    double salario = sc.nextDouble();
                    System.out.print("Informe a idade: ");
                    int idade = sc.nextInt();
                    System.out.print("Informe o endereco: ");
                    String endereco = sc.next();

                    integral.add(new trabalhadorIntegral(matricula, nome, salario, idade, endereco));

                    System.out.println("trabalhador " + nome + " cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Informe a matricula: ");
                    int matricula2 = sc.nextInt();
                    System.out.print("Informe o nome: ");
                    String nome2 = sc.next();
                    System.out.print("Informe o salario: ");
                    double salario2 = sc.nextDouble();
                    System.out.print("Informe a idade: ");
                    int idade2 = sc.nextInt();
                    System.out.print("Informe o endereco: ");
                    String endereco2 = sc.next();
                    System.out.print("Informe o total de horas trabalhadas: ");
                    double totalHoras = sc.nextDouble();
                    System.out.print("Informe o valor por hora: ");
                    double salarioHora = sc.nextDouble();

                    horista.add(new trabalhadorHorista(matricula2, nome2, salario2, idade2, endereco2, totalHoras, salarioHora));

                    System.out.println("trabalhador " + nome2 + " cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.print("Informe a matricula: ");
                    int buscaMatricula = sc.nextInt();
                    boolean encontrado = false;

                    for (trabalhadorHorista h: horista) {
                        if (h.getMatricula() == buscaMatricula) {
                            System.out.println("O salario do " + h.getNome() + " é: " + h.getSalario());
                            encontrado = true;
                        }
                    }

                    for (trabalhadorIntegral i: integral) {
                        if (i.getMatricula() == buscaMatricula) {
                            System.out.println("O salario do " + i.getNome() + " é: " + i.getSalario());
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Trabalhador nao encontrado!");
                    }
                    break;
                case 4:
                    System.out.print("Informe a matricula: ");
                    int buscaMatricula2 = sc.nextInt();
                    boolean encontrado2 = false;

                    for (trabalhadorHorista h: horista) {
                        if (h.getMatricula() == buscaMatricula2) {
                            System.out.println("Nome: " + h.getNome());
                            System.out.println("Idade: " + h.getIdade());
                            System.out.println("Salario: " + h.getSalario());
                            System.out.println("Endereco: " + h.getEndereco());
                            encontrado2 = true;

                        }
                    }

                    for (trabalhadorIntegral i: integral) {
                        if (i.getMatricula() == buscaMatricula2) {
                            System.out.println("Nome: " + i.getNome());
                            System.out.println("Idade: " + i.getIdade());
                            System.out.println("Salario: " + i.getSalario());
                            System.out.println("Endereco: " + i.getEndereco());
                            encontrado = true;   
                        }
                    }

                    if (!encontrado2) {
                        System.out.println("Trabalhador nao encontrado!");
                    }

                    break;

                case 5:
                    double maior = 0;
                    for (trabalhadorIntegral i: integral) {
                        if (maior == 0) {
                            maior = i.getSalario();
                        } else {
                            if (maior < i.getSalario()) {
                                maior = i.getSalario();
                            }
                        }
                    }

                    System.out.println("Maior salario é de: " + maior);
                    break;

                case 6:
                    int maioridade = 0;
                    for (trabalhadorHorista h: horista) {
                        if (maioridade == 0) {
                            maioridade = h.getIdade();
                        } else {
                            if (maioridade < h.getIdade()) {
                                maioridade = h.getIdade();
                            }
                        }
                    }

                    System.out.println("A maior idade entre os horistas é de: " + maioridade);
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opcao errada! Digite de novo!");
                    break;
            }
        }

    }
}
