# Atividade EBAC — Programação Funcional com Stream API

Projeto desenvolvido como prática do módulo de **Stream API** do curso Back-end Java da EBAC.

## Objetivo

Aplicar operações da Stream API para filtrar, transformar, ordenar e calcular dados de coleções em Java.

## Exercícios implementados

1. **Filtrar funcionários:** buscar funcionários nascidos entre 1975 e 1985 (inclusive) que recebem até R$ 3.000,00, considerando funcionários de todas as empresas.
2. **Somar números pares:** receber uma lista de números inteiros e retornar a soma dos valores pares.
3. **Maiores salários CLT:** selecionar funcionários contratados como CLT com menos de 25 anos, ordenar por salário decrescente e retornar no máximo 30 resultados.

## Conceitos praticados

- Stream API: `stream()`, `filter()`, `flatMap()`, `mapToInt()`, `sum()`, `sorted()`, `limit()` e `collect()`.
- Expressões lambda.
- Referência de método (`Integer::intValue`).
- Classes, construtores, atributos e getters.
- Datas com `LocalDate` e cálculo de idade com `Period`.

## Estrutura do projeto

```text
src/
├── Main.java
├── Empresa.java
└── Funcionario.java
```

- **Main.java:** cria os dados de teste e implementa os métodos dos exercícios.
- **Empresa.java:** representa uma empresa e sua lista de funcionários.
- **Funcionario.java:** representa os dados de um funcionário.

## Como executar

É necessário ter o **JDK 8 ou superior** instalado.

No terminal, a partir da pasta raiz do projeto, compile os arquivos:

```bash
javac src/*.java
```

Depois, execute a classe principal:

```bash
java -cp src Main
```

## Saída de exemplo

Com os dados de teste atuais, a saída é semelhante a:

```text
Leon
20
Claire - R$ 5200.0
Carlos - R$ 4500.0
Rebecca - R$ 3900.0
```

O primeiro resultado é o funcionário que atende aos critérios do exercício 1; `20` é a soma dos números pares do exercício 2; os nomes e salários seguintes correspondem aos funcionários elegíveis do exercício 3, em ordem decrescente de salário.

---

**Curso:** EBAC — Back-end Java  
**Tema:** Programação funcional e Stream API
