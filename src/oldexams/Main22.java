package oldexams;

import java.util.HashSet;
import java.util.Scanner;

public class Main22 {
    public static final HashSet<String> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            String next = input.next();
            String[] s = next.split(" ");
            for(String ss : s){
                set.add(ss);
            }
        }
        System.out.println(set.size());
    }
}
