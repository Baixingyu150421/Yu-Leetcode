public class search_0033 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (right - left) / 2 + left ;
            if(nums[mid] ==  target) return mid;
            if(nums[mid] < nums[right]){
                //目标值大于中间值 目标值小于右边界
                if(nums[mid] < target && target <= nums[right] ) left = mid + 1;
                else right = mid - 1;
            }else {
                //目标值小于中间值 目标值大于左边界
                if( target < nums[mid] &&  nums[left] <= target) right = mid - 1;
                else      left = mid + 1;
            }
        }
        return -1;
    }
}
