package newcode;

public class LeftRotateString {
    public static void main(String[] args) {
        String s = LeftRotateString("abcXYZdef", 3);
        System.out.println(s);
    }
    public static String LeftRotateString(String str,int n) {
        if(str == null || str.length() < 1) return "";
        if(n == 0) return str;
        int len = n % str.length();
        String substring = str.substring(0, len);
        String substring1 = str.substring(len, str.length());
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(substring1).append(substring).toString();
    }
}
