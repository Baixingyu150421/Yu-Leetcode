public class moveZeroes_283 {
    public static void main(String[] args) {
        int [] num = {1,1,0,3,12,0};
        moveZeroes(num);
        for(int a :num){
            System.out.print(a + " ");
        }
    }

    /**
     * 双指针
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int left = -1;
        int right = nums.length;
        for(int i = 0 ; i < nums.length ; i++ ){
            if(nums[i] != 0){
                swap(nums,i,++left);
            }
        }
    }
    public static void swap(int [] num , int a ,int b){
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }
}
