import java.util.Arrays;

public class findDuplicate2_0287 {
    public static void main(String[] args) {
        int [] num = {3,1,3,4,2};
        int duplicate = findDuplicate2(num);
        System.out.println(duplicate);
    }

    /**
     * 法一：不符题意
     * @param nums
     * @return
     */
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 1 ; i++ ){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }

    /**
     *  复杂度还OK
     * @param nums
     * @return
     */
    public  static int findDuplicate2(int[] nums) {
        for(int i = 0 ; i< nums.length ; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                return Math.abs(nums[i]);
            }else
                nums[index] = -nums[index];
        }
        return 0;
    }
}
