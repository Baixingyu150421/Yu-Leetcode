public class findPeakElement_0162 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int peakElement = findPeakElement(nums);
        System.out.println(peakElement);
    }
    //寻找峰值 时间复杂度O(n)
    public static int findPeakElement(int[] nums) {
        if(nums.length < 1) throw new RuntimeException("没有峰值");
        if(nums.length == 1) return 0;
        if(nums.length == 2) return nums[0] > nums[1] ? 0 : 1;
        if(nums[0] > nums[1]) return 0;
        if(nums[nums.length - 1] > nums[nums.length - 2]) return nums.length - 1;
        for(int i = 1 ; i < nums.length - 1 ; i++){
            if(nums[i] > nums[i - 1] && nums[i] > nums[i+1]){
                return i;
            }
            continue;
        }
        throw new RuntimeException("不存在峰值");
    }
}
