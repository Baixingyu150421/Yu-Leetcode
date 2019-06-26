import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
//
public class uncommonFromSentences_0884 {
    public String[] uncommonFromSentences(String A, String B) {
        String[] s1 = A.split(" ");
        String[] s2 = B.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i < s1.length ; i++ ){
            if(map.containsKey(s1[i])){
                map.put(s1[i],map.get(s1[i]) + 1);
            }else {
                map.put(s1[i],1);
            }
        }
        for(int j = 0 ; j < s2.length ; j++){
            if(map.containsKey(s2[j])){
                map.put(s2[j],map.get(s2[j]) + 1);
            }else {
                map.put(s2[j],1);
            }
        }
        ArrayList<String> list = new ArrayList<>();
        Set<String> strings = map.keySet();
        for(String str : strings){
            if(map.get(str) < 2){
                list.add(str);
            }
        }
        String [] s = new String[list.size()];
        for(int i = 0 ; i < s.length ; i++){
            s[i] = list.get(i);
        }
        return s;
    }
}
