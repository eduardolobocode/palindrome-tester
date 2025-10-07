# 🧮 Palindrome Tester

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Status](https://img.shields.io/badge/Testes-Passaram-success?style=for-the-badge)
![PUCRS](https://img.shields.io/badge/PUCRS-Verificação_e_Validação-blue?style=for-the-badge)

Projeto desenvolvido para a disciplina **Verificação e Validação de Software (PUCRS)**.  
O objetivo é implementar e testar uma função que verifica se um número inteiro é um **palíndromo**, aplicando **técnicas de teste estruturadas**.

---

## 🧩 Descrição do Problema

Um número é considerado **palíndromo** quando permanece igual ao ser lido da esquerda para a direita e da direita para a esquerda.  
Exemplo:  
- ✅ `121` → é palíndromo  
- ❌ `123` → não é palíndromo  

O método implementado é:

```java
public static boolean isPalindrome(int x)
Ele retorna true se o número for palíndromo e false caso contrário.

Estrutura do projeto
palindrome-tester/
│
├── src/
│   ├── Palindrome.java        → contém o método principal
│   └── PalindromeTest.java    → contém os testes manuais
│
├── tests.md                   → documentação das técnicas e resultados de teste
└── README.md                  → descrição geral do projeto

Técnicas de Teste Aplicadas

Partição de Equivalência:
Agrupamento de entradas com mesmo comportamento esperado.

Análise de Valor Limite:
Verificação de valores próximos das transições entre classes (bordas).

Todos os resultados esperados foram atingidos ✅

👥 Autores

Eduardo Lobo
Pedro Faviero

🏁 Conclusão

O projeto atendeu plenamente aos objetivos da disciplina, validando o método isPalindrome() com cobertura completa das classes de equivalência e dos valores-limite.
Todos os testes foram bem-sucedidos, demonstrando correção, robustez e clareza na implementação.