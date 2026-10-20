# Projeto Calculadora — FinançApp

> Projeto acadêmico desenvolvido com foco em Qualidade de Software, Testes, Refatoração, Documentação e Versionamento.

---

## 1. Identificação do Projeto

**Projeto:** Projeto Calculadora  
**Contexto:** FinançApp  
**Aluno:** Isabelle Aguiar  
**RA:** 250927
**Curso:** Análise e desenvolvimento de sistemas
**Disciplina:** UX/UI
**Professor:** Daniel Ohata
**Semestre:** 2026.2  

---

# 2. Visão Geral

O projeto consiste no desenvolvimento de um módulo de cálculos matemáticos básicos em Java para a startup fictícia **FinançApp**.

O módulo foi desenvolvido com o objetivo de ser utilizado futuramente em funcionalidades de controle financeiro, como:

- orçamento mensal;
- divisão de despesas;
- projeções financeiras;
- cálculos auxiliares.

Além do funcionamento correto das operações, o projeto aplica práticas de qualidade de software relacionadas a:

- testes;
- tratamento de erros;
- refatoração;
- documentação;
- versionamento;
- manutenção de código.

---

# 3. Problema

Durante o desenvolvimento da aplicação FinançApp, foi identificada a necessidade de criar um módulo matemático reutilizável.

Entretanto, a equipe definiu que o módulo não deveria apenas funcionar corretamente, mas também apresentar:

- código legível;
- testes automatizados;
- tratamento de falhas;
- documentação técnica;
- controle de versões;
- facilidade de manutenção.

O desafio consiste, portanto, em desenvolver uma solução funcional e ao mesmo tempo aplicar boas práticas de Engenharia de Software.

---

# 4. Objetivo

## 4.1 Objetivo Geral

Desenvolver uma calculadora em Java aplicando práticas de qualidade, testes, documentação, refatoração e versionamento.

## 4.2 Objetivos Técnicos

- implementar operações matemáticas básicas;
- tratar entradas inválidas;
- impedir divisão por zero;
- desenvolver testes automatizados;
- refatorar o código sem alterar seu comportamento;
- documentar classes e métodos com JavaDoc;
- gerar documentação HTML;
- utilizar Git e GitHub;
- organizar commits e branches;
- manter documentação técnica no README.

---

# 5. Escopo Funcional

| ID | Funcionalidade | Descrição | Status |
|---|---|---|---|
| RF01 | Soma | Soma dois números inteiros | ✅ |
| RF02 | Subtração | Subtrai dois números inteiros | ✅ |
| RF03 | Multiplicação | Multiplica dois números inteiros | ✅ |
| RF04 | Divisão | Divide dois números inteiros | ✅ |
| RF05 | Validação de divisão | Impede divisão por zero | ✅ |
| RF06 | Operação inválida | Trata operadores não suportados | ✅ |

---

# 6. Requisitos Não Funcionais

| ID | Categoria | Requisito |
|---|---|---|
| RNF01 | Qualidade | O código deve possuir organização e legibilidade |
| RNF02 | Testabilidade | As operações devem possuir testes automatizados |
| RNF03 | Manutenção | O código deve permitir refatoração sem alteração funcional |
| RNF04 | Documentação | Classes e métodos devem possuir JavaDoc |
| RNF05 | Versionamento | O projeto deve utilizar Git e GitHub |
| RNF06 | Confiabilidade | Erros não devem interromper inesperadamente a execução |

---

# 7. Tecnologias Utilizadas

| Tecnologia | Versão | Utilização |
|---|---|---|
| Java | 21 | Desenvolvimento |
| JDK | 21.0.8 | Compilação |
| Testes | Java puro (classe com `main`) | Testes unitários com entrada, esperado e obtido |
| Git | XX | Controle de versão |
| GitHub | — | Repositório remoto |
| JavaDoc | — | Documentação |
| IDE | VS Code | Ambiente de desenvolvimento |

---

# 8. Estrutura do Projeto

```text
projeto_calculadora/
│
├── src/
│   └── calculadora/
│       └── Calculadora.java
│
├── test/
│   └── calculadora/
│       └── TesteCalculadora.java
│
├── docs/
│   └── index.html
│
├── images/
│   ├── testes/
│   ├── javadoc/
│   └── refatoracao/
│
├── README.md
├── .gitignore
└── demais arquivos do projeto
```

---

# 9. Explicação das Operações

O método principal é `calc(int a, int b, String op)`. Ele recebe dois números inteiros e o símbolo da operação, e devolve o resultado como texto. Erros não lançam exceção para fora: viram mensagens, e o programa continua funcionando.

| Operação | Símbolo | Exemplo | Resultado |
|---|---|---|---|
| Soma | `+` | `calc(10, 5, "+")` | `15` |
| Subtração | `-` | `calc(10, 5, "-")` | `5` |
| Multiplicação | `*` | `calc(10, 5, "*")` | `50` |
| Divisão | `/` | `calc(10, 4, "/")` | `2.5` |
| Divisão por zero | `/` | `calc(10, 0, "/")` | `Erro: divisão por zero não é permitida.` |
| Operação inválida | `%` | `calc(10, 5, "%")` | `Erro: operação inválida.` |

---

# 10. Como Executar

No terminal, na pasta do projeto (Windows/PowerShell):

```bash
javac -encoding UTF-8 -d out src\calculadora\Calculadora.java test\calculadora\TesteCalculadora.java
java -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -cp out calculadora.TesteCalculadora
```

---

# 11. Testes

A classe `TesteCalculadora` cobre soma, subtração, multiplicação, divisão, divisão por zero, operação inválida e operação nula. Para cada teste são exibidos a entrada utilizada, o resultado esperado e o resultado obtido.

**Print da execução dos testes:**

![Execução dos testes](images/testes/testes.png)

---

# 12. Refatoração

A refatoração foi feita na branch `Refatoracao`, sem alterar o comportamento do sistema. Técnicas aplicadas:

- extração de métodos (`executar` e `dividir`);
- constantes para as mensagens de erro;
- `switch` no lugar de vários `if/else`;
- melhoria de nomes e legibilidade;
- organização lógica do código.

Após a refatoração, todos os testes foram executados novamente e continuaram passando.

**Print dos testes após a refatoração:**

![Testes após refatoração](images/refatoracao/testes-refatoracao.png)

---

# 13. Documentação JavaDoc

As classes, métodos, atributos, parâmetros, retornos e exceções foram documentados com JavaDoc (`@author`, `@version`, `@param`, `@return`, `@throws`). A documentação HTML fica na pasta `docs/`; abra o arquivo `docs/index.html`.

```bash
javadoc -d docs -encoding UTF-8 -charset UTF-8 -sourcepath src calculadora
```

**Print da documentação JavaDoc:**

![JavaDoc](images/javadoc/javadoc.png)

---

# 14. Versionamento

- `main`: branch principal, com a versão inicial e o merge final;
- `Refatoracao`: branch com o código refatorado e a documentação.

---

# 15. Link do Repositório

https://github.com/isaaaguiar/projeto_calculadora.git
