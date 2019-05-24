public class minPathSum_0064 {
    public static void main(String[] args) {
        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        int i = minPathSum(grid);
        System.out.println(i);
    }
    //dp[i][j]代表从(0,0)走到(i,j)的最小路径和则
    //dp[0][i]来自第一行的累加
    //dp[i][0]来自第一列的累加
    //dp[i][j] = min(dp[i-1][j],dp[i][j-1])+c[i][j](来自当前位置的走法无非向下或向右，选两者中代价最小的)
    //状态转移方程？？？
    //最小路径和  动态规划问题
    public  static int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];

        dp[0][0] = grid[0][0];
        for(int i = 1; i < rows; i++)
            dp[i][0] = dp[i-1][0] + grid[i][0];
        for(int j = 1; j < cols; j++)
            dp[0][j] = dp[0][j-1] + grid[0][j];

        for(int i = 1; i < rows; i++) {
            for(int j = 1; j < cols; j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[rows-1][cols-1];
    }
}
