public class findMin_0153 {
    public static void main(String[] args) {
        int min = findMin(new int[]{4,5,6,7,0,1,2});
        System.out.println(min);
    }
    public static int findMin(int[] nums) {
        int i = 0;
        for( ; i < nums.length - 1; i++){
            if(nums[i + 1] > nums[i]){
                continue;
            }else
                return nums[i + 1];
        }
        return nums[0];
    }
}
