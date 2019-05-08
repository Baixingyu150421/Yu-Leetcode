public class removeElement_0027 {
    /**
     * 2019-05-08
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != val){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
