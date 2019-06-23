import java.util.HashMap;
import java.util.HashSet;

public class wordPattern_0290 {
    public static void main(String[] args) {
        boolean b = wordPattern("abba", "dog dog dog dog");
        System.out.println(b);
    }
    public static boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        HashMap<Character,String> map = new HashMap();
        HashSet<String> set= new HashSet<>();
        if(s.length != pattern.length()) return false;
        int i = 0;
        int count = 0;
        while (i < pattern.length()){
            if(map.containsKey(pattern.charAt(i))){
                String s1 = map.get(pattern.charAt(i));
                if( !s1.equals(s[i])){
                    return false;
                }
                count --;
            }
            count++;
            set.add(s[i]);
            map.put(pattern.charAt(i),s[i]);
            i++;
        }
        if(set.size() != count) return false;
        return true;
    }
}
