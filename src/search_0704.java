import java.util.Arrays;

public class search_0704 {
    public static void main(String[] args) {
        // nums = [-1,0,3,5,9,12], target = 9
        int [] nums = {-1,0,3,5,9,12};
        int search = search(nums, 9);
        System.out.println(search);
    }

    /**
     * 二分查找
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1  ;
        while (start <= end){
            int middle =  start+ (end - start) / 2;
             if(nums[middle] > target){
               end = middle - 1;
            }else if (nums[middle] < target){
                start = middle+1;
            }else {
                 return middle;
             }
        }
        return -1;
    }

    /**
     * 库函数
     * @param nums
     * @param target
     * @return
     */
    public int search2(int[] nums, int target) {
        int i = Arrays.binarySearch(nums, target);
        return i >= 0 ? i : -1;
    }
}
