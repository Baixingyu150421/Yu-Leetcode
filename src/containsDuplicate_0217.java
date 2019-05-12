import java.util.Arrays;

public class containsDuplicate_0217 {
    public static void main(String[] args) {
        int [] nums = {1,1,1,3,3,4,4,2,2,4,3};
        boolean b = containsDuplicate(nums);
        System.out.println(b);
    }
    public  static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i <nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }else
                continue;
        }
        return false;
    }
}
