package oldexams;

import java.util.HashSet;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String next = input.next();
        char[] chars = next.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0 ; i < chars.length ; ++i){
            set.add(chars[i]);
        }
        System.out.println(set.size());
    }
}
