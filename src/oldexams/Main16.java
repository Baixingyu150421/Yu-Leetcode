package oldexams;

import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = Integer.MAX_VALUE;
        for(int i = a * b ; i >= Math.max(a,b) ; i--){
            if(i % a == 0 && i % b == 0){
                res = Math.min(res,i);
            }
        }
        System.out.println(res);
    }
}
