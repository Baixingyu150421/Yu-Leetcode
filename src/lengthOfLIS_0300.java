import org.omg.CORBA.INTERNAL;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class lengthOfLIS_0300 {
    public static void main(String[] args) {
        int[] nums = {4,10,4,3,8,9};
        int i = lengthOfLIS2(nums);
        System.out.println(i);
    }
    //解法一 时间复杂度0（N^2）
    public static int lengthOfLIS(int[] nums) {
        if(nums.length == 0 ) return 0;
        int [] dp = new int[nums.length];
        dp[0] = 1;
        int res = 1;
        for(int i = 1 ; i < dp.length ; i++){
            dp[i] = 1;
            for(int j = 0 ; j < i ; j++){
                if(nums[i] > nums[j] && dp[i]< dp[j] + 1){
                    dp[i] = dp[j] + 1;
                }
            }
            if(res < dp[i]){
                res = dp[i];
            }
        }
        return res;
    }

    //解法二: 时间复杂度O(nlogN)
    public static int lengthOfLIS2(int[] nums) {
        if(nums.length == 0) return 0;
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(nums[0]);
        for(int  i = 1 ; i < nums.length ;i++){
            if(nums[i] > list.get(list.size() - 1)){
                list.add(nums[i]);
            }//求解该元素要存放的位置
            else {
              //用于保证当前元素的下一个元素是比它大的元素中最小的那个 使用二分查找确定其位置
              int pos = myBinarySearch(list,nums[i]);
              list.set(pos,nums[i]);
            }
        }
        return list.size();
    }
    private static int myBinarySearch(ArrayList<Integer> list, int num) {
        int [] arr = new int[list.size()];
        for(int i = 0 ; i < list.size(); i++){
           arr[i] = list.get(i);
        }
        int left = 0;
        int right = arr.length - 1;
        int index = -1;
        while (index == -1){
            int mid = (left + right)/2;
            if(arr[mid] > num){
                if(mid == 0 || num > arr[mid - 1]){
                    index = mid;
                }
                right = mid - 1;
            }else if(arr[mid] < num){
                if(mid == arr.length - 1 || num < arr[mid +1]){
                    index = mid + 1;
                }
                left =  mid + 1;
            }else {
                index = mid;
            }
        }
        return index;
    }
}
