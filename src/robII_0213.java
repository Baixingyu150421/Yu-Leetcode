public class robII_0213 {
    public static void main(String[] args) {
        int rob = rob(new int[]{1,2,3,1});
        System.out.println(rob);
    }
    public static int rob(int[] nums) {
       if(nums == null || nums.length == 0) return 0;
       int n = nums.length;
       if(n == 1) return nums[0];
       if(n == 2) return Math.max(nums[0],nums[1]);
       int [] dp0 = new int[n - 1];
       int [] dp1 = new int[n - 1];
       dp0[0] = nums[0];
       dp0[1] = Math.max(nums[0],nums[1]);
       dp1[0] = nums[1];
       dp1[1] = Math.max(nums[1],nums[2]);
       for(int i = 2 ; i < n - 1 ; i++){
           dp0[i] = Math.max(dp0[i - 2] + nums[i],dp0[i - 1]);
           //从1开始的
           dp1[i] = Math.max(dp1[i - 2] + nums[i + 1],dp1[i - 1]);
       }
       return Math.max(dp0[n - 2],dp1[n - 2]);
    }
}
