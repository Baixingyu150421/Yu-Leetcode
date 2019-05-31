package Test;

public class reverseString {
    public String reverseString(String iniString) {
        // write code here
        StringBuilder sb = new StringBuilder(iniString);
        return sb.reverse().toString();
    }

}
