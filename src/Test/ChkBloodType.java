package Test;

import java.util.HashMap;

public class ChkBloodType {
    public static void main(String[] args) {

    }
    //验证血型
    public String[] chkBlood(String father, String mother) {
        // write code here
        HashMap<String,String[]> map = new HashMap<>();
        map.put("OO",new String[] {"O"});
        map.put("AO",new String[] {"A","O"});
        map.put("AA",new String[] {"A","O"});
        map.put("AB",new String[] {"A","AB","B","O"});
        map.put("AAB",new String[] {"A","AB","B"});
        map.put("BO",new String[] {"B","O"});
        map.put("BB",new String[] {"B","O"});
        map.put("BAB",new String[] {"A","AB","B"});
        map.put("ABO",new String[] {"A","B"});
        map.put("ABAB",new String[] {"A","AB","B"});
        if(map.containsKey(father + mother) == false){
            return map.get(mother + father);
        }
        return map.get(father+ mother);
    }
}
