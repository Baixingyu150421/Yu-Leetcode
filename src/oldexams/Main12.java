package oldexams;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String next = sc.nextLine();
            int len = next.length();
            String[] s = next.split(" ");
            StringBuilder sb = new StringBuilder();
            for(int i = s.length - 1 ;  i >= 0 ; i--){
                sb.append(s[i] + " ");
            }
            System.out.println(sb.substring(0, len));
        }
    }
}
