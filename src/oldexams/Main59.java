package oldexams;

import java.util.Scanner;

public class Main59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        for(int i = 0  ; i < next.length() - 1 ; i++){
            if((int)next.charAt(i) > 90 || (int)next.charAt(i) <65 || (next.charAt(i) - 'A' == next.charAt(i + 1) - 'A') ){
                System.out.println("Dislikes");
                return;
            }
        }
        System.out.println("Likes");
    }
}
