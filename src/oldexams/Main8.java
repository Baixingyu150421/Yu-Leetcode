package oldexams;

import java.util.HashMap;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();
        String s = String.valueOf(nextInt);
        StringBuilder ss = new StringBuilder(s);
        String string = ss.reverse().toString();
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < string.length() ; i++){
            if(map.containsKey(string.charAt(i))){
                continue;
            }else {
                sb.append(string.charAt(i));
                map.put(string.charAt(i),null);
            }
        }
        System.out.println(sb.toString());
    }
}
