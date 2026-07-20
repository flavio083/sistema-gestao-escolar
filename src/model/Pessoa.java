package model;

public abstract class Pessoa {

    protected int id;
    protected String nome;

    private static int contador = 1;

    public Pessoa(String nome) {
        this.id = contador++;
        this.nome = nome;
    }

    public abstract String getDescricao();

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public abstract double calcularMediaFinal();
}