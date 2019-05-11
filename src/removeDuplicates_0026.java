/**
 * 快慢指针 去除数组中的重复项
 */
public class removeDuplicates_0026 {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length < 1) return 0;
        int i = 0;
        for(int j = 1 ; j < nums.length ; j++){
            if(nums[j] == nums[i]){
                continue;
            }else{
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
}
