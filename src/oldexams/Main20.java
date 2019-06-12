package oldexams;

public class Main20 {
    public static void main(String[] args) {

    }
    public int countWays(int n) {
        int [] dp = new int[101];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 2;
        for(int i = 4 ; i <= n  ; i++){
            dp[i] =( dp[i - 1] + dp[i - 2] )% 1000000007;
        }
        return dp[n ];
    }
}
