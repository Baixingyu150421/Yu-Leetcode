package oldexams;

import java.util.HashSet;
import java.util.Scanner;

public class Main38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        if(next.length() == 1) {System.out.println(51); return;}
        StringBuilder sb ;
        HashSet<String> set = new HashSet<>();
        for(int i = 0 ; i <= next.length() ; i++){
            for(int j = 97 ; j <=122 ; j++  ){
                sb = new StringBuilder();
                String s1 = next.substring(0, i);
                String s2 = next.substring(i, next.length());
                StringBuilder append = sb.append(s1).append((char) j).append(s2);
                set.add(append.toString());
            }
        }
        System.out.println(set.size());
    }
}
