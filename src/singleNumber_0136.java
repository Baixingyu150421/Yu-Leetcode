import java.util.Arrays;
import java.util.Stack;

public class singleNumber_0136 {

    public static void main(String[] args) {
        int [] arr = {1,2,1,2,5,6,3,3,6,7,8,7,8};
        int i = singleNumber2(arr);
        System.out.println(i);
    }

    /**
     * 依据题意
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 1 ; i += 2){
            if(nums[i] == nums[i+1]){
                continue;
            }
            return nums[i];
        }
       return nums[nums.length - 1];
    }

    /**
     * 异或运算
     * @param num
     * @return
     */
    public static int singleNumber2(int [] num){
        int result = 0;
        for(int i = 0 ; i < num.length ; i++ ){
            result ^= num[i];
        }
        return result;
    }

}
