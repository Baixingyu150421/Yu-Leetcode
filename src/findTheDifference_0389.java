import java.util.HashSet;

public class findTheDifference_0389 {
    //哈希表
    public char findTheDifference(String s, String t) {
        int [] hashtable1 = new int[26];
        int [] hashtable2 = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            hashtable1[s.charAt(i) - 'a']++;
        }
        for(int j = 0 ; j < t.length() ; j++){
            hashtable2[t.charAt(j) - 'a']++;
        }
        for(int index = 0 ; index < hashtable1.length ; index++){
            if(hashtable1[index] != hashtable2[index]){
                return (char) ('a' + index);
            }
        }
        throw new RuntimeException("error");
    }
}
