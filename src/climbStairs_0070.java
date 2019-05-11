/**
 * 不能使用递归，时间复杂度高
 */

public class climbStairs_0070 {
    public static void main(String[] args) {
        int i = climbStairs(4);
        System.out.println(i);
    }
    public static int climbStairs(int n) {
        if(n == 0 || n == 1|| n==2) return n;
        int [] res = new int[n+1];
        res[0] = 0;
        res[1] = 1;
        res[2] = 2;
        for(int i=3 ; i <= n ; i ++){
            res[i] = res[i - 1] + res[i -2];
        }
        return res[n ];
    }
}
