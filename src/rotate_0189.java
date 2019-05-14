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
        int[] nums = {-1,-100,3,99};
        rotate(nums,2);
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
    public  void rotate2(int[] nums, int k) {
        int time = nums.length - 1;
        for(int i = 0 ; i < k ; i++){
            int temp = nums[time];
            while (time > 0){
                nums[time] = nums[time --];
            }
            nums[0] = temp;
        }
    }
}
