package lista6.atividade4;

public class apartamento extends imovel {
    private String nomePredio;

    public apartamento(String rua, String bairro, String cidade, String estado, String cep, double preco, boolean mobiliado, boolean alugado, String nomePredio, apartamento apartamento) {
        super(rua, bairro, cidade, estado, cep, preco, mobiliado, alugado, apartamento);
        this.nomePredio = nomePredio;
    }

    public String getNomePredio() { return this.nomePredio;}


}
