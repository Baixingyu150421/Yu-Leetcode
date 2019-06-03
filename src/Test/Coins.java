package Test;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[n + 1];
        dp[0] = 1;
        int[] coin = new int[]{1, 5, 10, 20, 50, 100};
        for (int i = 0; i < coin.length; i++) {
            for (int j = coin[i]; j <= n; j++) {
                dp[j] = dp[j] + dp[j - coin[i]];
            }
        }
        System.out.print(dp[n]);
    }
}
