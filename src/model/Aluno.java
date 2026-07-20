package model;

import enums.StatusAluno;

public class Aluno extends Pessoa {

    public static final double MAX_DESCONTO = 50.0;

    private String matricula;
    private double mensalidade;
    private double desconto;

    private double[] notas = new double[3];
    private int quantidadeNotas = 0;
    private int faltas = 0;

    public Aluno(String nome, String matricula, double mensalidade) {

        super(nome);

        this.matricula = matricula;
        this.mensalidade = mensalidade;
    }

    @Override
    public String getDescricao() {
        return "Aluno: " + nome;
    }

    public void aplicarBolsa(double percentual) {

        if (percentual > MAX_DESCONTO) {
            percentual = MAX_DESCONTO;
        }

        desconto = percentual;
    }

    public final String gerarComprovanteMatricula() {

        return "Aluno: "
                + nome
                + " Matrícula: "
                + matricula;
    }
    public void adicionarNota(double nota) {

        if(quantidadeNotas < 3) {

            notas[quantidadeNotas] = nota;
            quantidadeNotas++;
        }
    }
    public void adicionarNota(double[] novasNotas) {

        for(double nota : novasNotas) {

            adicionarNota(nota);
        }
    }
    public void registrarFalta() {
        faltas++;
    }
    public String getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public int getFaltas() {
        return faltas;
    }
    public double calcularMedia() {

        double soma = 0;

        for(double nota : notas) {
            soma += nota;
        }

        return soma / 3;
    }
    public StatusAluno getStatus() {

        double media = calcularMedia();

        if(media >= 7) {
            return StatusAluno.APROVADO;
        }

        if(media >= 5) {
            return StatusAluno.RECUPERACAO;
        }

        return StatusAluno.REPROVADO;
    }
    @Override
    public double calcularMediaFinal() {
        return calcularMedia();
    }
}