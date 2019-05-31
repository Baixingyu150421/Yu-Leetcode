package Test;

public class checkReverseEqual {
    public boolean checkReverseEqual(String s1, String s2) {
        // write code here
        if(s2 == null || s1 == null || s1.length() < 1 || s2.length() < 1){
            return false;
        }
        String temp = s1 + s1;
        if(temp.contains(s2))return true;
        return false;
    }
}
