import java.util.Arrays;

/**
 * 找众数
 */
public class majorityElement_0169 {
    public int majorityElement(int[] nums) {
        //1.投机取巧
        Arrays.sort(nums);
        return nums[nums.length / 2];
        //2.
        //     int length = nums.length / 2;
        //     int count = 1;
        //     for(int i = 0 ; i < nums.length - 1; i++){
        //         if(nums[i+1] != nums[i]){
        //             if(count > length){
        //                 return nums[i];
        //             }else {
        //                 count = 1;
        //             }
        //             continue;
        //         }else if(nums[i+1] == nums[i]){
        //             count++;
        //         }else if (count >length){
        //             return nums[i];
        //         }
        //     }
        //     return nums[nums.length - 1];
        // }
    }
}
