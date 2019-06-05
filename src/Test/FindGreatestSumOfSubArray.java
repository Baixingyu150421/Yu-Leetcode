package Test;

public class FindGreatestSumOfSubArray {
    public static void main(String[] args) {

    }

    public int FindGreatestSumOfSubArray(int[] array) {
        int [] dp = new int[array.length + 1];
        dp[0] = array[0];
        for(int i = 1 ; i < array.length ; i++){
            dp[i] = dp[i - 1] + array[i] > array[i] ? dp[i - 1] + array[i] : array[i];
        }
        int Max = Integer.MIN_VALUE;
        for(int i = 0 ; i < dp.length ; ++ i){
           Max = Math.max(dp[i],Max);
        }
        return Max;
    }
}
