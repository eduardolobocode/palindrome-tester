# 🧪 Testes do Kata "Palindrome Number"

**Disciplina:** Verificação e Validação de Software  
**Grupo:** Eduardo Lobo e Pedro Faviero  
**Linguagem:** Java  
**Problema:** Determinar se um número inteiro é um palíndromo (mesmo número quando lido de trás pra frente).

---

## 🎯 Objetivo
Aplicar as técnicas de **partição de equivalência** e **análise de valor limite** para validar o método `isPalindrome(int x)`, implementado em Java.

---

## 🧩 Técnica 1 — Partição de Equivalência

Dividimos o conjunto de possíveis entradas em classes que devem produzir o mesmo resultado esperado:

| Classe de entrada | Descrição | Exemplo | Resultado esperado |
|--------------------|------------|----------|---------------------|
| Números negativos  | Nunca podem ser palíndromos | -121 | Falso |
| Números positivos palíndromos | Lidos igual da esquerda pra direita e vice-versa | 121, 1221, 12321 | Verdadeiro |
| Números positivos não palíndromos | Mudam quando invertidos | 10, 12345 | Falso |
| Zero (caso especial) | Deve ser tratado como palíndromo | 0 | Verdadeiro |

---

## 📈 Técnica 2 — Análise de Valor Limite

Verificamos valores próximos das transições entre classes, garantindo comportamento correto nas bordas:

| Caso limite | Valor testado | Resultado esperado |
|--------------|----------------|---------------------|
| Menor número possível (negativo) | -1 | Falso |
| Menor palíndromo possível | 0 | Verdadeiro |
| Menor número de dois dígitos não palíndromo | 10 | Falso |
| Palíndromo de múltiplos dígitos | 1221 | Verdadeiro |
| Palíndromo ímpar (3 dígitos) | 121 | Verdadeiro |

---

## ⚙️ Execução dos testes

Os testes foram executados diretamente via `main()` na classe `PalindromeTest.java`, que compara o resultado retornado pelo método com o valor esperado.

**Saída do terminal:**
? Teste OK para 121
? Teste OK para -121
? Teste OK para 10
? Teste OK para 0
? Teste OK para 1221
? Teste OK para 12321
? Teste OK para 12345


---

## ✅ Conclusão

Todos os testes retornaram o resultado esperado, confirmando que o método `isPalindrome()`:
- trata corretamente números negativos;
- reconhece zeros e palíndromos válidos;
- e rejeita números não palíndromos.

O código demonstrou **cobertura adequada** das classes de equivalência e valores-limite, validando o comportamento esperado do algoritmo.

---

> 📘 **Observação:**  
> O teste foi implementado manualmente (sem framework) para fins didáticos, conforme o objetivo do trabalho de Verival.