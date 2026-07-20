# 🎓 Sistema de Gestão Escolar

<p align="center">

Projeto desenvolvido para a disciplina de **Programação Orientada a Objetos (POO)** utilizando **Java**, aplicando os principais conceitos da orientação a objetos e seguindo a arquitetura **MVC (Model-View-Controller)**.

</p>

---

## 📖 Sobre o Projeto

O Sistema de Gestão Escolar simula o funcionamento básico de uma instituição de ensino, permitindo o gerenciamento de alunos, professores, disciplinas e turmas.

Além das operações de cadastro, o sistema também realiza o controle de notas, frequência, bolsas de estudo, emissão de boletins e geração de relatórios, sempre com validações e tratamento de exceções para garantir a integridade dos dados.

---

## ✨ Funcionalidades

- 👨‍🎓 Cadastro de alunos
- 👨‍🏫 Cadastro de professores
- 📚 Cadastro de disciplinas
- 🏫 Criação de turmas
- 📝 Matrícula de alunos
- 📊 Lançamento de notas
- 📅 Registro de frequência
- 📄 Emissão de boletim
- 📈 Relatório da turma
- 🎓 Aplicação de bolsas
- 🔄 Transferência de alunos
- ⚠️ Tratamento de exceções
- ✅ Validação de entradas com JOptionPane

---

# 🏗️ Arquitetura do Projeto

O sistema foi desenvolvido seguindo o padrão **MVC (Model-View-Controller)**.

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

# 💻 Tecnologias Utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub
- Swing (JOptionPane)

---

# 🧠 Conceitos de POO Aplicados

Durante o desenvolvimento foram utilizados diversos conceitos da Programação Orientada a Objetos.

| Conceito | Aplicação |
|----------|-----------|
| Encapsulamento | Uso de atributos privados e métodos getters/setters |
| Herança | Classes `Aluno` e `Professor` herdando de `Pessoa` |
| Polimorfismo | Sobrescrita do método `calcularMediaFinal()` |
| Sobrecarga | Método `adicionarNota()` |
| Classe Abstrata | Classe `Pessoa` |
| Constantes | Uso de `final` |
| Atributos Estáticos | Uso de `static` |
| Enums | `Turno` e `StatusAluno` |
| Exceções Customizadas | Validação das regras de negócio |
| MVC | Separação entre Model, View e Controller |

---

# ✅ Funcionalidades Implementadas

| Funcionalidade | Status |
|----------------|:-----:|
| Cadastro de Alunos | ✅ |
| Cadastro de Professores | ✅ |
| Cadastro de Disciplinas | ✅ |
| Cadastro de Turmas | ✅ |
| Matrícula de Alunos | ✅ |
| Lançamento de Notas | ✅ |
| Registro de Frequência | ✅ |
| Emissão de Boletim | ✅ |
| Relatório da Turma | ✅ |
| Aplicação de Bolsa | ✅ |
| Transferência de Alunos | ✅ |

---

# ⚠️ Tratamento de Erros

O sistema possui validações para evitar falhas durante a execução.

Entre elas:

- ✅ Notas apenas entre **0 e 10**
- ✅ Limite máximo de alunos por turma
- ✅ Transferência apenas entre turmas do mesmo turno
- ✅ Validação de entradas numéricas
- ✅ Mensagens de erro utilizando **JOptionPane**
- ✅ Exceções customizadas para regras de negócio

---

# 🚀 Como Executar

### Clone o repositório

```bash
git clone https://github.com/flavio083/sistema-gestao-escolar.git
```

### Entre na pasta

```bash
cd sistema-gestao-escolar
```

### Abra o projeto

Abra o projeto utilizando uma IDE Java, como:

- IntelliJ IDEA
- Eclipse
- NetBeans

### Execute

```
Main.java
```

---

# 👨‍💻 Autor

### Flaviano Aguiar Silva Filho

🎓 Estudante de Sistemas de Informação — UNIFACISA

📍 Campina Grande - PB

### Contato

GitHub

> https://github.com/flavio083

LinkedIn

> https://www.linkedin.com/in/flaviano-aguiardev/

---

# 📄 Licença

Este projeto foi desenvolvido exclusivamente para fins acadêmicos e de aprendizado da disciplina de Programação Orientada a Objetos.

---