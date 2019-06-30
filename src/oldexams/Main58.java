package oldexams;

import java.util.HashSet;
import java.util.Scanner;

public class Main58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            HashSet<Character> set = new HashSet<>();
            for(int i = 0 ; i < s2.length() ; i++){
                set.add(s2.charAt(i));
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < s1.length() ;i++){
                if(set.contains(s1.charAt(i))){
                    continue;
                }
                sb.append(s1.charAt(i));
            }
            System.out.println(sb.toString());
        }
    }
}
