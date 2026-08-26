package lista6.atividade1;

public class aluno extends pessoa {
    private double[] notas = new double[4];

    public aluno(String nome, int cpf, String dataNascimento, double nota1, double nota2, double nota3, double nota4) {
        super(nome, cpf, dataNascimento);
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
        this.notas[3] = nota4;
    }

    public double media() {
        int soma = 0;

        for (int i =0; i < notas.length; i++) {
            soma += this.notas[i];
        }

        return soma / 4;

    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Media: " + media());
    }

}
