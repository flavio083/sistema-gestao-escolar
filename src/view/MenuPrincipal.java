package view;

import controller.EscolaController;
import javax.swing.JOptionPane;
import model.*;
import enums.Turno;

public class MenuPrincipal {

    private EscolaController controller;

    public MenuPrincipal() {

        controller = new EscolaController();
    }

    public void iniciar() {

        int opcao;

        do {

            opcao = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            """
                            1 - Cadastrar Aluno
                            2 - Cadastrar Professor
                            3 - Criar Disciplina
                            4 - Criar Turma
                            5 - Matricular Aluno
                            6 - Lançar Nota
                            7 - Registrar Frequência
                            8 - Emitir Boletim
                            9 - Relatório da Turma
                            10 - Aplicar Bolsa
                            11 - Transferir Aluno
                            0 - Sair
                            """
                    )
            );

            switch(opcao) {

                case 1: {
                    String nomeAluno =
                            JOptionPane.showInputDialog(
                                    "Digite o nome do aluno:"
                            );

                    String matricula =
                            JOptionPane.showInputDialog(
                                    "Digite a matrícula:"
                            );

                    double mensalidade =
                            Double.parseDouble(
                                    JOptionPane.showInputDialog(
                                            "Digite a mensalidade:"
                                    )
                            );

                    Aluno aluno =
                            new Aluno(
                                    nomeAluno,
                                    matricula,
                                    mensalidade
                            );

                    controller.cadastrarAluno(aluno);

                    JOptionPane.showMessageDialog(
                            null,
                            "Sucesso",
                            "Aluno cadastrado com sucesso!",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    break;
                }

                case 2: {
                    String nomeProfessor =
                            JOptionPane.showInputDialog(
                                    "Digite o nome do professor:"
                            );

                    double salario =
                            Double.parseDouble(
                                    JOptionPane.showInputDialog(
                                            "Digite o salário:"
                                    )
                            );

                    Professor professor =
                            new Professor(
                                    nomeProfessor,
                                    salario
                            );

                    controller.cadastrarProfessor(professor);

                    JOptionPane.showMessageDialog(
                            null,
                            "Sucesso",
                            "Professor cadastrado com sucesso!",
                            JOptionPane.INFORMATION_MESSAGE

                    );

                    break;
                }

                case 3: {
                    String nomeDisciplina =
                            JOptionPane.showInputDialog(
                                    "Digite o nome da disciplina:"
                            );

                    int cargaHoraria =
                            Integer.parseInt(
                                    JOptionPane.showInputDialog(
                                            "Digite a carga horária:"
                                    )
                            );

                    Disciplina disciplina =
                            new Disciplina(
                                    nomeDisciplina,
                                    cargaHoraria
                            );

                    controller.cadastrarDisciplina(disciplina);

                    JOptionPane.showMessageDialog(
                            null,
                            "Sucesso",
                            "Disciplina cadastrada com sucesso!",
                            JOptionPane.INFORMATION_MESSAGE

                    );

                    break;
                }

                case 4: {

                    String nomeTurma =
                            JOptionPane.showInputDialog(
                                    "Digite o nome da turma:"
                            );

                    String nomeDisciplina =
                            JOptionPane.showInputDialog(
                                    "Digite o nome da disciplina já cadastrada:"
                            );

                    String nomeProfessor =
                            JOptionPane.showInputDialog(
                                    "Digite o nome do professor já cadastrado:"
                            );

                    Disciplina disciplina =
                            controller.buscarDisciplina(
                                    nomeDisciplina
                            );

                    Professor professor =
                            controller.buscarProfessor(
                                    nomeProfessor
                            );

                    if (disciplina == null || professor == null) {

                        JOptionPane.showMessageDialog(
                                null,
                                "Professor ou disciplina não encontrados!"
                        );

                        break;
                    }

                    String turnoTexto =
                            JOptionPane.showInputDialog(
                                    "Turno (MANHA, TARDE ou NOITE):"
                            );

                    Turno turno =
                            Turno.valueOf(
                                    turnoTexto.toUpperCase()
                            );

                    Turma turma =
                            new Turma(
                                    nomeTurma,
                                    disciplina,
                                    professor,
                                    turno
                            );

                    controller.cadastrarTurma(turma);

                    JOptionPane.showMessageDialog(
                            null,
                            "Turma criada com sucesso!"
                    );

                    break;
                }

                case 5: {
                    String matriculaAluno =
                            JOptionPane.showInputDialog(
                                    "Digite a matrícula do aluno:"
                            );

                    String nomeTurmaMatricula =
                            JOptionPane.showInputDialog(
                                    "Digite o nome da turma:"
                            );

                    try {

                        controller.matricularAluno(
                                matriculaAluno,
                                nomeTurmaMatricula
                        );

                        JOptionPane.showMessageDialog(
                                null,
                                "Sucesso",
                                "Aluno matriculado com sucesso!",
                                JOptionPane.INFORMATION_MESSAGE

                        );

                    } catch(Exception e) {

                        JOptionPane.showMessageDialog(
                                null,
                                e.getMessage(),
                                "Erro",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }
                    break;
                }

                case 6: {

                    String matriculaAluno =
                            JOptionPane.showInputDialog(
                                    "Digite a matrícula do aluno:"
                            );

                    double nota =
                            Double.parseDouble(
                                    JOptionPane.showInputDialog(
                                            "Digite a nota:"
                                    )
                            );

                    try {

                        controller.lancarNota(
                                matriculaAluno,
                                nota
                        );

                        JOptionPane.showMessageDialog(
                                null,
                                "Sucesso",
                                "Nota lançada com sucesso!",
                                JOptionPane.INFORMATION_MESSAGE

                        );

                    } catch(Exception e) {

                        JOptionPane.showMessageDialog(
                                null,
                                e.getMessage(),
                                "Erro",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }

                    break;
                }
                case 7: {

                        String matriculaAluno =
                                JOptionPane.showInputDialog(
                                        "Digite a matrícula do aluno:"
                                );

                        controller.registrarFrequencia(
                                matriculaAluno
                        );

                        JOptionPane.showMessageDialog(
                                null,
                                "Sucesso",
                                "Frequência registrada com sucesso!",
                                JOptionPane.INFORMATION_MESSAGE

                        );

                    break;
                }

                case 8: {

                    String matriculaAluno =
                            JOptionPane.showInputDialog(
                                    "Digite a matrícula do aluno:"
                            );

                    String boletim =
                            controller.emitirBoletim(
                                    matriculaAluno
                            );

                    JOptionPane.showMessageDialog(
                            null,
                            boletim,
                            "Boletim",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                    break;
                }

                case 9: {

                    String nomeTurma =
                            JOptionPane.showInputDialog(
                                    "Digite o nome da turma:"
                            );

                    String relatorio =
                            controller.gerarRelatorioTurma(
                                    nomeTurma
                            );

                    JOptionPane.showMessageDialog(
                            null,
                            relatorio,
                            "Relatório da Turma",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                    break;
                }

                case 10: {

                    String matriculaAluno =
                            JOptionPane.showInputDialog(
                                    "Digite a matrícula do aluno:"
                            );

                    double percentual =
                            Double.parseDouble(
                                    JOptionPane.showInputDialog(
                                            "Digite o percentual da bolsa:"
                                    )
                            );

                    controller.aplicarBolsa(
                            matriculaAluno,
                            percentual
                    );

                    JOptionPane.showMessageDialog(
                            null,
                            "Sucesso",
                            "Bolsa aplicada com sucesso!",
                            JOptionPane.INFORMATION_MESSAGE

                    );

                    break;
                }

                case 11: {

                    String matriculaAluno =
                            JOptionPane.showInputDialog(
                                    "Digite a matrícula do aluno:"
                            );

                    String turmaOrigem =
                            JOptionPane.showInputDialog(
                                    "Digite a turma de origem:"
                            );

                    String turmaDestino =
                            JOptionPane.showInputDialog(
                                    "Digite a turma de destino:"
                            );

                    try {

                        controller.transferirAluno(
                                matriculaAluno,
                                turmaOrigem,
                                turmaDestino
                        );

                        JOptionPane.showMessageDialog(
                                null,
                                "Sucesso",
                                "Transferência realizada com sucesso!",
                                JOptionPane.INFORMATION_MESSAGE

                        );

                    } catch(Exception e) {

                        JOptionPane.showMessageDialog(
                                null,
                                e.getMessage(),
                                "Erro",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }

                    break;
                }

                case 0:
                    break;

                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opção inválida!",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE
                    );
            }

        } while(opcao != 0);
    }
}