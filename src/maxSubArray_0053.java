public class maxSubArray_0053 {
    //求数组的最大子序和   动态规划问题
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for(int a : nums){
            //大于零符合条件直接加
            if(sum > 0){
                sum += a;
            }
            //sum <= 0 那么后面的子序列不包含当前的子序列 ，所以就从这个位置开始
            else
                sum = a;
            //总是返回最大值
            res = Math.max(res,sum);
        }
        return res;
    }
}
