package lista6.atividade4;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class imobiliaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ArrayList<imovel> imovel = new ArrayList<>();
        ArrayList<apartamento> apartamento = new ArrayList<>();
        ArrayList<casa> casa = new ArrayList<>();

        int valor = -1;

        while (valor != 0) {
            System.out.print("""
                    1. Registrar Casa
                    2. Registrar Apartamento
                    3. Listar Imóveis não alugados (pelo nome da rua)
                    4. Listar todos os Imóveis mobiliados
                    0. Sair
                    Resposta: """);
                valor = sc.nextInt();

                switch(valor) {
                    case 1:
                        System.out.print("Digite o nome da rua: ");
                        String rua = sc.next();
                        System.out.print("Digite o nome do bairro: ");
                        String bairro = sc.next();
                        System.out.print("Digite o nome da cidade: ");
                        String cidade = sc.next();
                        System.out.print("Digite o nome do estado: ");
                        String estado = sc.next();
                        System.out.print("Digite o cep: ");
                        String cep = sc.next();
                        System.out.print("Digite o preço: ");
                        double preco = sc.nextDouble();
                        System.out.print("O imóvel é mobiliado? (true/false): ");
                        boolean mobiliado = sc.nextBoolean();
                        System.out.print("O imóvel está alugado? (true/false): ");
                        boolean alugado = sc.nextBoolean();

                        casa.add(new casa(rua, bairro, cidade, estado, cep, preco, mobiliado, alugado));
                        System.out.println("Casa do bairro " + bairro + " cadastrada!");
                        break;

                    case 2:
                        System.out.print("Digite o nome da rua: ");
                        String rua1 = sc.next();
                        System.out.print("Digite o nome do bairro: ");
                        String bairro1 = sc.next();
                        System.out.print("Digite o nome da cidade: ");
                        String cidade1 = sc.next();
                        System.out.print("Digite o nome do estado: ");
                        String estado1 = sc.next();
                        System.out.print("Digite o cep: ");
                        String cep1 = sc.next();
                        System.out.print("Digite o preço: ");
                        double preco1 = sc.nextDouble();
                        System.out.print("O imóvel é mobiliado? (true/false): ");
                        boolean mobiliado1 = sc.nextBoolean();
                        System.out.print("O imóvel está alugado? (true/false): ");
                        boolean alugado1 = sc.nextBoolean();
                        System.out.print("Digite o nome do prédio: ");
                        String nomePredio = sc.next();

                        apartamento.add(new apartamento(rua1, bairro1, cidade1, estado1, cep1, preco1, mobiliado1, alugado1, nomePredio));
                        System.out.println("Apartamento do prédio " + nomePredio + " cadastrado!");
                        break;
                    case 3:
                        System.out.print("Digite o nome da rua: ");
                        String buscaRua = sc.next();
                        boolean encontrado = false;
                        for (imovel i : imovel) {
                            if (i.getAlugado() == false && i.getRua().equalsIgnoreCase(buscaRua)) {
                                System.out.println("Imovel encontrado na rua " + buscaRua + ":");
                                System.out.println("Bairro: " + i.getBairro());
                                System.out.println("Cidade: " + i.getCidade());
                                System.out.println("Estado: " + i.getEstado());
                                System.out.println("CEP: " + i.getCep());
                                System.out.println("Preço: " + i.getPreco());
                                System.out.println("Mobiliado: " + i.getMobiliado());
                                System.out.println("Alugado: " + i.getAlugado());
                                if (i instanceof apartamento) {
                                    System.out.println("Nome do prédio: " + i.getApartamento().getNomePredio());
                                }
                                encontrado = true;
                            }
                        } 
                        if (!encontrado) {
                            System.out.println("Nenhum imovel encontrado na rua " + buscaRua);
                        }
                        break;
                    case 4:
                        System.out.println("Lista dos imóveis mobilados:");
                        for (imovel i : imovel) {
                            if (i.getMobiliado() == true) {
                                System.out.println("Imovel encontrado:");
                                System.out.println("Rua: " + i.getRua());
                                System.out.println("Bairro: " + i.getBairro());
                                System.out.println("Cidade: " + i.getCidade());
                                System.out.println("Estado: " + i.getEstado());
                                System.out.println("CEP: " + i.getCep());
                                System.out.println("Preço: " + i.getPreco());
                                System.out.println("Mobiliado: " + i.getMobiliado());
                                System.out.println("Alugado: " + i.getAlugado());
                                if (i instanceof apartamento) {
                                    System.out.println("Nome do prédio: " + i.getApartamento().getNomePredio());
                                }
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }

        }

    }
}
