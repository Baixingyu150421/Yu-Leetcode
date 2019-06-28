import java.util.HashMap;
//同构字符串
public class isIsomorphic_0205 {
    public boolean isIsomorphic(String s, String t) {
        String str1 = helper(s);
        String str2 = helper(t);
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
    private static String helper(String t) {
        int index = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < t.length() ; i++){
            if(map.containsKey(t.charAt(i))){
                sb.append(map.get(t.charAt(i)));
            }else {
                map.put(t.charAt(i),++index);
                sb.append(index);
            }
        }
        return sb.toString();
    }
}
