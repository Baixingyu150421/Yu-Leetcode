package oldexams;

import java.util.HashSet;
import java.util.Scanner;

public class Main43 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()){
//            String a = sc.next();
//            String b = sc.next();
//            if(!checkStr(a,b)){
//                System.out.println(0);
//            }
//            if(!assertStr(a,b)){
//                System.out.println(0);
//            }
//            System.out.println(1);
//        }
//    }
        public static void main(String[] args) {
            boolean b = assertStr("dscsdadvdvdf", "dfasdfew");

        }
    public static boolean checkStr(String s1 , String s2){
        HashSet<Character> set = new HashSet<>();
        for(int i = 0 ; i < s1.length() ; i++){
            set.add(s1.charAt(i));
        }
        for(int j = 0 ; j < s2.length() ; j++){
            if(!set.contains(s2.charAt(j))){
                return false;
            }
        }
        return true;
    }
    public static boolean assertStr(String s1, String s2){
        int min = Math.min(s1.length(),s2.length());
        if(s1.length() > min){
            for(int i = 0 ; i <= s1.length() - min ; i++){
                String substring = s1.substring(i, i + min);
                if(substring.equals(s2)) return true;
            }
        }else {
            for(int i = 0 ; i <= s2.length() - min ; i++){
                String substring = s2.substring(i, i + min);
                if(substring.equals(s1)) return true;
            }
        }
        return false;
    }
}
