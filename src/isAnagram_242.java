import java.util.Arrays;

public class isAnagram_242 {
    public static void main(String[] args) {
        String s = "";
        String t = "cat";
        boolean anagram = isAnagram1(s, t);
        System.out.println(anagram);
    }
    //法1 使用库函数
    public  static boolean isAnagram(String s, String t) {
        if(s.length() < 1 && t.length() < 1) {return true;}
        if(s.length() != t.length()){return false;}
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        int i = 0 ;
        while (i < chars1.length){
            if(chars1[i] != chars2[i]){
                return false;
            }
            i++;
        }
        return true;
    }
    //法2 使用库函数
    public  static boolean isAnagram1(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
       return   Arrays.equals(chars1,chars2);
    }
    //法3  hash映射 判断字母类型以及出现次数
    public  static boolean isAnagram2(String s, String t) {
        if(s.length() < 1 && t.length() < 1) {return true;}
        if(s.length() != t.length()){return false;}
        int [] num1 = new int[26];
        int [] num2 = new int[26];
        for(int i = 0 ; i < s.length(); i++){
            num1[s.charAt(i) - 'a'] ++;
            num2[t.charAt(i) - 'a'] ++;
        }
        for(int j = 0 ; j < num1.length ; j++){
            if(num1[j] != num2[j])
                return false;
        }
        return true;
    }
}
