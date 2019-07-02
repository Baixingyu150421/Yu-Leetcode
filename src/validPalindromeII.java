public class validPalindromeII {
    public static void main(String[] args) {
        boolean aba = validPalindrome("ebcbbececabbacecbbcbe");
        System.out.println(aba);
    }
    public static boolean validPalindrome(String s) {
       for(int i = 0 , j = s.length() - 1 ; i < j ; i++ , j--){
           if(s.charAt(i) != s.charAt(j)){
               return isPalindrome(s,i,j-1) || isPalindrome(s,i+1,j);
           }
       }
       return true;
    }

    private static boolean isPalindrome(String s, int i, int i1) {
        while (i < i1){
            if(s.charAt(i++) != s.charAt(i1--)){
                return false;
            }
        }
        return true;
    }

}
