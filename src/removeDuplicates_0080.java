//删除数组中的重复元素II
public class removeDuplicates_0080 {
    public static void main(String[] args) {
        int [] num = {1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int i = removeDuplicates(num);
        System.out.println(i);
    }
    //双指针  返回新的数组
    public  static int removeDuplicates(int[] nums) {
        int count = 1;
        int index = 1;
        for(int i = 1 ; i < nums.length ; i ++  ){
            if(nums[i - 1] == nums[i]){
                if(count < 2){
                    count++;
                    nums[index++] = nums[i];
                }
            }else{
                count = 1;
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
