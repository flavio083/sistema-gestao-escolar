package model;

import enums.Turno;
import exceptions.TurmaLotadaException;

import java.util.ArrayList;

public class Turma {

    public static int LIMITE_PADRAO = 30;

    private String nome;

    private Disciplina disciplina;
    private Professor professor;
    private Turno turno;

    private ArrayList<Aluno> alunos;

    public Turma(String nome, Disciplina disciplina, Professor professor, Turno turno) {

        this.nome = nome;
        this.disciplina = disciplina;
        this.professor = professor;
        this.turno = turno;

        alunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno)
            throws TurmaLotadaException {

        if(alunos.size() >= LIMITE_PADRAO) {
            throw new TurmaLotadaException(
                    "Turma lotada!"
            );
        }

        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Turno getTurno() {
        return turno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public String getNome() {
        return nome;
    }
}