import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findDuplicates_0442 {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        List<Integer> duplicates = findDuplicates2(arr);
        for(Integer i : duplicates){
            System.out.print(i + ",");
        }
    }

    /**
     * 垃圾解法
     * @param nums
     * @return
     */
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 1 ; i++ ){
            if(nums[i] == nums[i+1]){
                list.add(nums[i]);
                i++;
            }else continue;
        }
        return list;
    }

    /**
     * 没看懂
     * @param nums
     * @return
     */
    public static List<Integer> findDuplicates2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return list;
        }
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i])-1;  //指向要修改的下标
            if(nums[index] < 0) {  //已经被修改过了，就代表这个数字重复出现了
                list.add(Math.abs(nums[i]));
            }else {
                nums[index] = -nums[index];
            }
        }
        return list;
    }
}
