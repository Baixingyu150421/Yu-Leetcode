package oldexams;

public class Main23 {
    public static void main(String[] args) {

    }
    //求最大子段和
    public int maxSubArray(int[] nums) {
        if(nums.length < 1) return 0;
        if(nums.length == 1)return nums[0];
        int [] dp = new int[nums.length];
        dp[0] = nums[0];
        int result = dp[0];
        for(int i = 1 ; i < nums.length ; i++){
            dp[i] = Math.max(dp[i-1] + nums[i],nums[i]);
            result = Math.max(result,dp[i]);
        }
        return result;
    }
}
