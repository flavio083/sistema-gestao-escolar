package controller;

import model.*;

import utils.Validador;

import java.util.ArrayList;

import exceptions.TransferenciaInvalidaException;

public class EscolaController {

    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Turma> turmas;

    public EscolaController() {

        alunos = new ArrayList<>();
        professores = new ArrayList<>();
        disciplinas = new ArrayList<>();
        turmas = new ArrayList<>();
    }
    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    public void cadastrarProfessor(Professor professor) {
        professores.add(professor);
    }
    public void cadastrarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
    public void cadastrarTurma(Turma turma) {
        turmas.add(turma);
    }
    public Aluno buscarAluno(String matricula) {

        for (Aluno aluno : alunos) {

            if(aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }

        return null;
    }
    public Turma buscarTurma(String nome) {

        for(Turma turma : turmas) {

            if(turma.getNome().equalsIgnoreCase(nome)) {
                return turma;
            }
        }

        return null;
    }
    public void matricularAluno(String matricula, String nomeTurma)
            throws Exception {

        Aluno aluno = buscarAluno(matricula);

        Turma turma = buscarTurma(nomeTurma);

        if(aluno != null && turma != null) {

            turma.matricularAluno(aluno);

        }
    }
    public void lancarNota(String matricula, double nota)
            throws Exception {

        Validador.validarNota(nota);

        Aluno aluno = buscarAluno(matricula);

        if(aluno != null) {

            aluno.adicionarNota(nota);
        }
    }
    public void registrarFrequencia(String matricula) {

        Aluno aluno = buscarAluno(matricula);

        if(aluno != null) {

            aluno.registrarFalta();
        }
    }
    public void aplicarBolsa(String matricula, double percentual) {

        Aluno aluno = buscarAluno(matricula);

        if(aluno != null) {

            aluno.aplicarBolsa(percentual);
        }
    }
    public void transferirAluno(String matricula, String turmaOrigem, String turmaDestino)
            throws Exception {

        Turma origem = buscarTurma(turmaOrigem);

        Turma destino = buscarTurma(turmaDestino);

        Aluno aluno = buscarAluno(matricula);

        if(origem == null || destino == null || aluno == null) {

            return;
        }

        if(origem.getTurno() != destino.getTurno()) {

            throw new TransferenciaInvalidaException(
                    "As turmas precisam ter o mesmo turno!"
            );
        }

        destino.matricularAluno(aluno);

        origem.removerAluno(aluno);
    }
    public void lancarNota(String matricula, double[] notas)
            throws Exception {

        for(double nota : notas) {
            Validador.validarNota(nota);
        }

        Aluno aluno = buscarAluno(matricula);

        if(aluno != null) {

            aluno.adicionarNota(notas);
        }
    }
    public String emitirBoletim(String matricula) {

        Aluno aluno = buscarAluno(matricula);

        if(aluno == null) {
            return "Aluno não encontrado!";
        }

        String boletim = "";

        boletim += "Aluno: " + aluno.getNome() + "\n\n";

        boletim += "Notas:\n";

        for(double nota : aluno.getNotas()) {

            boletim += nota + "\n";
        }

        boletim += "\nMédia: " + String.format("%.2f", aluno.calcularMediaFinal());

        boletim += "\nStatus: " + aluno.getStatus();

        boletim += "\nFaltas: " + aluno.getFaltas();

        return boletim;
    }

    public String gerarRelatorioTurma(String nomeTurma) {

        Turma turma = buscarTurma(nomeTurma);

        if (turma == null) {
            return "Turma não encontrada!";
        }

        String relatorio = "";

        relatorio += "- RELATÓRIO DA TURMA -\n\n";

        relatorio += "Turma: " + turma.getNome() + "\n";

        relatorio += "Disciplina: " + turma.getDisciplina().getNome() + "\n";

        relatorio += "Professor: " + turma.getProfessor().getNome() + "\n\n";

        relatorio += "Alunos:\n";

        double somaMedias = 0;

        for (Aluno aluno : turma.getAlunos()) {

            relatorio += aluno.getNome() + " - Media: " + String.format("%.2f", aluno.calcularMediaFinal()) + "\n";

            somaMedias += aluno.calcularMedia();
        }

        double mediaTurma = 0;

        if (!turma.getAlunos().isEmpty()) {

            mediaTurma = somaMedias / turma.getAlunos().size();
        }

        relatorio += "\nMedia Geral da Turma: " + String.format("%.2f", mediaTurma);

        return relatorio;
    }
    public Professor buscarProfessor(String nome) {

        for(Professor professor : professores) {

            if(professor.getNome().equalsIgnoreCase(nome)) {
                return professor;
            }
        }

        return null;
    }
    public Disciplina buscarDisciplina(String nome) {

        for(Disciplina disciplina : disciplinas) {

            if(disciplina.getNome().equalsIgnoreCase(nome)) {
                return disciplina;
            }
        }

        return null;
    }
}