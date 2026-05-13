# 🎟️ Atendimento com Fila de Senhas — Padrão de Projeto Iterator

> Atividade prática da disciplina de **Padrões de Projeto** do curso de **Análise e Desenvolvimento de Sistemas (ADS) - IFPB**, aplicando o padrão **Iterator** para percorrer uma fila de senhas de atendimento sem expor diretamente sua estrutura interna.

---

## 📌 Sobre o projeto

Este projeto simula um sistema de controle de fila de atendimento em uma instituição. Cada pessoa recebe uma senha e aguarda sua vez para ser chamada. Utilizando o **padrão Iterator**, o código que utiliza a fila não acessa diretamente sua estrutura interna a navegação entre as senhas é feita exclusivamente por meio do iterator, que controla internamente a posição atual da sequência.

---

## 🎯 Objetivo

Aplicar o padrão **Iterator** para:

- Percorrer uma coleção de senhas sem expor sua estrutura interna
- Separar a lógica de navegação da lógica de armazenamento
- Evitar que a classe `Main` manipule diretamente listas, arrays ou índices

---

## 🧠 O Padrão Iterator

O **Iterator** é um padrão comportamental que fornece uma forma de acessar sequencialmente os elementos de uma coleção sem expor sua representação interna.

---

## 🗂️ Estrutura do Projeto

```
SistemaDeAtendimentoComFila/
  └── src/
        ├── FilaAtendimento         → coleção (mantém estrutura interna protegida)
        ├── FilaAtendimentoIterator → iterator concreto (controla a navegação)
        ├── IteratorSenha           → interface (contrato do iterator)
        ├── Main
        └── SenhaAtendimento        → classe de domínio (senha, nome, tipo de atendimento)
```

---

## 💡 Responsabilidades das Classes

| Classe | Papel no Iterator | Descrição |
|---|---|---|
| `IteratorSenha` | **Interface** | Contrato com os métodos `hasNext()` e `next()` |
| `FilaAtendimentoIterator` | **Concrete Iterator** | Controla internamente a posição atual da navegação |
| `FilaAtendimento` | **Concrete Collection** | Armazena as senhas e fornece o iterator |
| `SenhaAtendimento` | **Elemento** | Representa uma senha com identificação, nome e tipo de atendimento |

---

## 👨‍💻 Autor

Desenvolvido como atividade prática da disciplina de **Padrões de Projeto** - ADS · IFPB.
