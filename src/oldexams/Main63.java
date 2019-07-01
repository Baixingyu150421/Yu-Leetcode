package oldexams;

import java.util.Scanner;

public class Main63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int [] num = new int[n + 1];
        for(int i = 1 ; i <= n ; i++){
            num[i] = sc.nextInt();
        }
        long [][] dp = new long[n + 1][sum + 1 ];
        //初始化第一行
        for (int i = 0 ; i < sum ; i++){
            dp[0][i] = 0;
        }
        //初始化第一列
        for(int j = 0 ; j < n ; j++){
            dp[j][0] = 1;
        }
        //开始填表
        for(int i = 1 ; i <= n ; i++ ){
            for(int j = 1 ; j <= sum ; j++){
                if(num[i] <= j){
                    dp[i][j] = dp[i -1][j] + dp[i - 1][j - num[i]];
                }else {
                    dp[i][j] += dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][sum]);

    }
}
