package oldexams;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = sc.next();
        String s1 = str.toLowerCase();
        s.toLowerCase();
        int res = 0;
        for(int i = 0 ; i < s1.length() ; i++){
            if(s1.charAt(i) == s.charAt(0)){
                res++;
            }
        }
        System.out.println(res);
    }
}
