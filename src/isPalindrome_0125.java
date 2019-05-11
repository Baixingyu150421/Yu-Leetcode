public class isPalindrome_0125 {
    public static void main(String[] args) {
        String s = "race a car";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);
//        System.out.println(s.trim().toLowerCase());
//        System.out.println(':' - '9');
//        System.out.println((byte)' ');

    }
    public static boolean isPalindrome(String s) {
        if (s == null) return true;
        String s1 = s.toLowerCase();
        char[] chars = s1.toCharArray();
        int left = 0;
        int right = s1.length() - 1;
        while (left < right) {
            if (chars[left] == chars[right]) {
                left++;
                right--;
            } else if (!((chars[left]  >= 97 && chars[left]  <= 122) || (chars[left]  >= 48 && chars[left] <= 57))) {
                left++;
            } else if (!((chars[right] >= 97 && chars[right] <= 122) || (chars[right] >= 48 && chars[right] <= 57))) {
                right--;
            } else if (chars[left] != chars[right]) {
                return false;
            }
        }
        return true;
    }
}
