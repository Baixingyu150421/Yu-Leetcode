import java.util.*;

public class findRepeatedDnaSequences_0187 {
    //简单方式
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        if(s.length() == 10) return new ArrayList<>();
        for(int i= 0 ; i <= s.length() - 10 ; i++){
            String substring = s.substring(i, 10);
            if(map.containsKey(substring)){
                map.put(substring,map.get(substring) + 1);
            }else {
                map.put(substring,1);
            }
        }
        List<String> res = new ArrayList<>();
        Set<String> strings = map.keySet();
        for(String ss :strings ){
            if(map.get(ss) > 1){
                res.add(ss);
            }
        }
        return res;
    }


}
