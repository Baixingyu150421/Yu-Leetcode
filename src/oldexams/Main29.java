package oldexams;

import java.util.Scanner;

public class Main29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long res = (long) Math.pow(l,0.5);
        if( res *(res + 1) > l){
            System.out.println(res - 1);
        }else {
            System.out.println(res);
        }
    }
}
