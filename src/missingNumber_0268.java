import java.util.Arrays;

public class missingNumber_0268 {
    public static void main(String[] args) {
        //9,6,4,2,3,5,7,0,1
        int[] nums = {3,0,1};
        int i = missingNumber2(nums);
        System.out.println(i);
    }
    //采用 异或运算
    public  static int missingNumber(int[] nums) {
        int res = nums.length;
        //异或运算  1 2 3 4  1 2 3 5
        for(int i = 0 ; i < nums.length; i++){
               res ^= nums[i] ;
               res ^= i;
        }
        return res;
    }
    //等差数列求和
    public  static int missingNumber2(int[] nums) {
        int res = ((1 + nums.length) * nums.length)>> 1;
        for(int i = 0 ; i < nums.length ; i++){
            res -= nums[i];
        }
        return res;
    }
}
