package lista6.atividade4;

public class imovel {
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private double preco;
    private boolean mobiliado;
    private boolean alugado;
    private apartamento apartamento;


    public imovel(String rua, String bairro, String cidade, String estado, String cep, double preco, boolean mobiliado, boolean alugado, apartamento apartamento) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.preco = preco;
        this.mobiliado = mobiliado;
        this.alugado = alugado;
        this.apartamento = apartamento;
    }

    public String getRua() { return this.rua;}

    public void setRua(String rua) { this.rua = rua;}

    public String getBairro() { return this.bairro;}

    public void setBairro(String bairro) { this.bairro = bairro;}

    public String getCidade() { return this.cidade;}

    public void setCidade(String cidade) { this.cidade = cidade;}

    public String getEstado() { return this.estado;}

    public void setEstado(String estado) { this.estado = estado;}

    public String getCep() { return this.cep;}

    public void setCep(String cep) { this.cep = cep;}

    public double getPreco() { return this.preco;}

    public void setPreco(double preco) { this.preco = preco;}

    public boolean getMobiliado() { return this.mobiliado;}

    public void setMobiliado(boolean mobiliado) { this.mobiliado = mobiliado;}

    public boolean getAlugado() { return this.alugado;}

    public void setAlugado(boolean alugado) { this.alugado = alugado;}

    public apartamento getApartamento() { return this.apartamento;}

    public void setApartamento(apartamento apartamento) { this.apartamento = apartamento;}

}
