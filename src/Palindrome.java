public class Palindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0) return false; // números negativos não são palíndromos

        String num = Integer.toString(x);

        int left = 0;                      
        int right = num.length() - 1;     

        for (; left < right; left++, right--) {
            if (num.charAt(left) != num.charAt(right)) {
                return false; 
            }
        }

        return true; 
    }

    //main
    public static void main(String[] args) {
        int[] tests = {121, -121, 10, 0, 1221, 12321, 12345};

        for (int num : tests) {
            System.out.println(num + " → " + isPalindrome(num));
        }
    }
}
