import java.util.*;

public class findLongestWord_0524 {
    //"ale","apple","monkey","plea"
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ale");
        list.add("apple");
        list.add("monkey");
        list.add("plea");
        String abpcplea = findLongestWord("abpcplea", list);
        System.out.println(abpcplea);
    }
    public static String findLongestWord(String s, List<String> d) {
        HashSet<Character> set = new HashSet<>();
        for(Character c : s.toCharArray()){
            set.add(c);
        }
        ArrayList<String> list = new ArrayList<String>();
        for (String str : d){
            for (Character cc : str.toCharArray()){
                if(!set.contains(cc)){
                    continue;
                }
            }
            int index1 = 0;
            int index2 = 0;
            while (index1 < s.length() && index2 < str.length()){

                if(s.charAt(index1) == str.charAt(index2)){
                    index1++; index2++;
                }else {
                    index1++;
                }
                if(index1  == s.length() - 1 && index2 != str.length() - 1){
                    break;
                }
            }
            if(index2 == str.length() && index1 <= s.length()){
                list.add(str);
            }
        }
        if(list.size() == 0){
            return "";
        }

        String s1 = "";

        for(String ss : list){
            if(ss.length() > s1.length()){
                s1 = ss;
            }else if(ss.length() == s1.length()){
                if(ss.compareTo(s1) < 0){
                    s1 = ss;
                }
            }
        }
        return s1;
    }
}
