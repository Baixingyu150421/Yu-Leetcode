public class towSum_0001 {
    /**
     * 2019-05-08  时间复杂度O(N^2) 空间复杂度O(1)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i]  <= target) {
                int y = target - nums[i];
                for(int j = i+1 ; j < nums.length ; j++) {
                    if(nums[j] == y) {
                        return new int[] {i,j};
                    }
                }
            }
        }
        return new int[] {-1,-1};
    }
}
