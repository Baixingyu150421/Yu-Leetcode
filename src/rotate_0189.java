public class rotate_0189 {
    public static void rotate(int[] nums, int k) {
        for(int i = 0 ; i < k ; i++){
            int time = nums.length - 1;
            while (time > 0){
                swap(nums,time,--time);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate2(nums,3);
        for(int a :nums){
            System.out.print(a + " ");
        }
    }

    public static void swap(int [] num, int a, int b){
        int temp = num[b];
        num[b] = num[a];
        num[a] = temp;
    }

    /**
     *正解 暴力循环    旋转字符串
     * @param nums
     * @param k
     */
    public static   void rotate2(int[] nums, int k) {
        int time = nums.length - 1;
        for(int i = 0 ; i < k ; i++){
            int temp = nums[time];
            nums[time] = nums[time--];
            nums[0] = temp;
        }
    }
    //复制数组
    public static void rotate3(int [] nums , int k){
        int n = nums.length;
        k %= n;
        for(int i = 0 ; i < k ; i++){
            int temp = nums[nums.length - 1];
            System.arraycopy(nums,0,nums,1,n-1);
            nums[0] = temp;
        }
    }
}
