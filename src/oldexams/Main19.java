package oldexams;

import java.util.HashMap;

public class Main19 {
    public char findFirstRepeat(String A, int n) {
        // write code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < A.length() ; i++){
            if(map.containsKey(A.charAt(i))){
                return A.charAt(i);
            }
            else {
                map.put(A.charAt(i),null);
            }
        }
        throw new RuntimeException("没有重复字符");
    }
}
