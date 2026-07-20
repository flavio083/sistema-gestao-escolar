# 🎓 Sistema de Gestão Escolar

> Projeto desenvolvido para a disciplina de **Programação Orientada a Objetos (POO)**, utilizando **Java** e arquitetura **MVC**.

O sistema simula a gestão de uma instituição de ensino, permitindo o cadastro de alunos, professores, disciplinas e turmas, além do gerenciamento de notas, frequência, bolsas e emissão de boletins.

---

## 📚 Funcionalidades

✔️ Cadastro de alunos

✔️ Cadastro de professores

✔️ Cadastro de disciplinas

✔️ Criação de turmas

✔️ Matrícula de alunos

✔️ Lançamento de notas

✔️ Registro de frequência

✔️ Emissão de boletim

✔️ Relatório da turma

✔️ Aplicação de bolsa

✔️ Transferência de alunos entre turmas

✔️ Tratamento de erros com exceções customizadas

✔️ Validação de entradas utilizando JOptionPane

---

# 🏗️ Arquitetura

O projeto foi organizado seguindo o padrão **MVC (Model-View-Controller)**.

```
src
│
├── controller
│   └── EscolaController.java
│
├── model
│   ├── Pessoa.java
│   ├── Aluno.java
│   ├── Professor.java
│   ├── Disciplina.java
│   └── Turma.java
│
├── view
│   └── MenuPrincipal.java
│
├── enums
│   ├── StatusAluno.java
│   └── Turno.java
│
├── exceptions
│   ├── NotaInvalidaException.java
│   ├── TransferenciaInvalidaException.java
│   └── TurmaLotadaException.java
│
├── utils
│   └── Validador.java
│
└── main
    └── Main.java
```

---

# 💻 Tecnologias utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub
- JOptionPane

---

# 🧠 Conceitos de Programação Orientada a Objetos

Durante o desenvolvimento foram aplicados diversos conceitos de POO, como:

- Encapsulamento
- Herança
- Polimorfismo
- Sobrecarga de métodos
- Sobrescrita de métodos
- Classes abstratas
- Constantes (`final`)
- Atributos estáticos (`static`)
- Enums
- Exceções customizadas
- Organização em pacotes
- Arquitetura MVC

---

# 📌 Funcionalidades implementadas

| Funcionalidade | Status |
|---------------|:------:|
| Cadastro de Alunos | ✅ |
| Cadastro de Professores | ✅ |
| Cadastro de Disciplinas | ✅ |
| Cadastro de Turmas | ✅ |
| Matrícula | ✅ |
| Registro de Frequência | ✅ |
| Lançamento de Notas | ✅ |
| Emissão de Boletim | ✅ |
| Relatório da Turma | ✅ |
| Aplicação de Bolsa | ✅ |
| Transferência de Alunos | ✅ |

---

# ⚠️ Tratamento de Erros

O sistema realiza validações para evitar falhas durante a execução.

Entre elas:

- Notas entre 0 e 10
- Turmas com limite máximo de alunos
- Transferência apenas entre turmas do mesmo turno
- Validação de entradas numéricas
- Mensagens de erro através do JOptionPane

---

# ▶️ Como executar

1. Clone este repositório

```bash
git clone https://github.com/flavio083/sistema-gestao-escolar.git

2. Abra o projeto em uma IDE Java (IntelliJ IDEA ou Eclipse).

3. Execute a classe:

```
Main.java
```

4. Utilize o menu para acessar todas as funcionalidades.

---

# 👨‍💻 Autor

**Flaviano Aguiar Silva Filho**

- 💼 Estudante de Sistemas de Informação — UNIFACISA
- 🌎 Campina Grande - PB

GitHub:
https://github.com/flavio083

LinkedIn:
https://www.linkedin.com/in/flaviano-aguiardev/

---

# 📄 Licença

Este projeto foi desenvolvido para fins acadêmicos, podendo ser utilizado como material de estudo e aprendizado.