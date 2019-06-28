package oldexams;

import java.util.HashSet;
import java.util.Scanner;

public class Main55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        String[] s = next.split(" ");
        HashSet<Integer> set = new HashSet<>();
        for(String ss : s){
            int anInt = Integer.parseInt(ss);
            if(set.contains(anInt)){
                System.out.println(anInt);
                return;
            }else {
                set.add(anInt);
            }
        }
    }
}
