import java.util.HashMap;
import java.util.Map;

public class findMaxConsecutiveOnes_0485 {
    public static void main(String[] args) {
        int [] num = {0,0};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(num);
        System.out.println(maxConsecutiveOnes);
    }

    /**
     * 最大连续一的个数 简单明了
     * @param nums
     * @return
     */
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int res = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                count++;
                res = Math.max(count,res);
            }
            else{
                count = 0;
            }
        }
        return res;
    }
}
