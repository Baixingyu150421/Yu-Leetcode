package oldexams;

import java.util.Scanner;

public class Main46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] dp = new int[10000];
        dp[0] = 0;
        for(int i = 1 ; i < dp.length ; i++){
            dp[i] = dp[i - 1] + i;
        }
        for(int i = 0 ; i < dp.length ; i++){
            if(dp[i] == n){
                System.out.println(i);
                return;
            }else if(dp[i] > n){
                System.out.println(i);
                return;
            }else continue;
        }
    }
}
