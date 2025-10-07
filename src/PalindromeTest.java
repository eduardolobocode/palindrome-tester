public class PalindromeTest {

    public static void main(String[] args) {
        // Testes Automaticos
        testPalindrome(121, true);
        testPalindrome(-121, false);
        testPalindrome(10, false);
        testPalindrome(0, true);
        testPalindrome(1221, true);
        testPalindrome(12321, true);
        testPalindrome(12345, false);
    }

    // Resultado auxiliar que executa o teste e printa se ta funcionando ou nao
    public static void testPalindrome(int input, boolean expected) {
        boolean result = Palindrome.isPalindrome(input);
        if (result == expected) {
            System.out.println("✅ Teste OK para " + input);
        } else {
            System.out.println("❌ Teste FALHOU para " + input + " — esperado " + expected + ", obtido " + result);
        }
    }
}

