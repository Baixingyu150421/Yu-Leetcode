package Test;

public class rotateString {
    public String rotateString(String A, int n, int p) {
        // write code here
        int length = p % n;
        String substring1 = A.substring(0, length + 1);
        String substring2 = A.substring(length+1,A.length());
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder append = stringBuilder.append(substring2).append(substring1);
        return  append.toString();
    }
}
