/**
 * 一次遍历，没有二分查找
 */
public class searchInsert_0035 {
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int i = searchInsert(nums, 0);
        System.out.println(i);
    }
    public static int searchInsert(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++){
            if(target >nums[i]) continue;
            if(target<= nums[i]) return i;
        }
        return nums.length;
    }
}
