package oldexams;

public class Main24 {
    public static void main(String[] args) {

    }
    public int coinChange(int[] coins, int amount) {
        //i代表凑成该金额最少的硬币数
        int [] dp = new int[amount + 1];
        dp[0] = 0;
        for(int i = 1; i <= amount ;i++ ){
            boolean flag = false;
            dp[i]=Integer.MAX_VALUE;
            for(int coin : coins){
                if(i - coin >= 0 && dp[i - coin] != -1){
                    flag = true;
                    dp[i] = Math.min(dp[i],dp[i - coin] + 1);
                }
            }
            //无法凑成的金额置为-1
            if(flag == false){
                dp[i] = -1;
            }
        }
        return dp[amount] == -1 ? -1 : dp[amount];
    }
}
