public class calculateMinimumHP_0174 {
    public static void main(String[] args) {
        int [][] arr = {
                {-2,-3,3},
                {-5,-10,1},
                {10,30,-5}
        };
        int i = calculateMinimumHP(arr);
        System.out.println(i);
    }
    public static int calculateMinimumHP(int[][] dungeon) {
        if(dungeon.length == 0) return 0;
        int row = dungeon.length;
        int col = dungeon[0].length;
        int [][] dp = new int[row][col];
        dp[row - 1][col - 1] = dungeon[row - 1][col - 1] > 0 ? 1 : 1 - dungeon[row - 1][col - 1];
        for(int i = row -  2 ; i >= 0 ; i --){
            dp[i][col - 1] = Math.max(1,dp[i+1][col - 1] - dungeon[i][col - 1]);
        }
        for(int j = col - 2; j >= 0 ; j --){
            dp[row - 1][j] = Math.max(1,dp[row - 1][j+1] - dungeon[row - 1][j]);
        }
        for(int i = row - 2; i >= 0 ; i--){
            for(int j = col - 2 ;j >= 0 ;j--){
                int min = Math.min(dp[i+1][j],dp[i][j+1]);
                dp[i][j] = Math.max(1,min - dungeon[i][j]);
            }
        }
        return dp[0][0];
    }
}
