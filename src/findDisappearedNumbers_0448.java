import java.util.ArrayList;
import java.util.List;

public class findDisappearedNumbers_0448 {
    public static void main(String[] args) {
        int [] num = {3,2,7,8,2,3,1};
        List<Integer> disappearedNumbers = findDisappearedNumbers(num);
        for(Integer i : disappearedNumbers){
            System.out.print(i + " ");
        }
    }

    /**
     *  将数组中每个数对用的数组下标位置的数组元素取反，然后遍历数组大于0的数且数组下标位置加一就是缺少的数
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        for(int i = 0 ; i < nums.length ; ++i ){
            nums[Math.abs(nums[i]) - 1] = - Math.abs(nums[Math.abs(nums[i]) - 1]);
        }
        List<Integer> list = new ArrayList<>();
        for(int j = 0 ; j < nums.length ; ++j){
            if(nums[j] > 0){
                list.add(j+1);
            }
        }
        return list;
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int j = 1 ; j <= nums.length ; j++){
            int i = 0;
            boolean b = true;
            for( ; i < nums.length ; i++){
                if(j == nums[i]){
                    b = false;
                    break;
                }
            }
            if( b == true){
                list.add(j);
            }
        }
        return list;
    }
}
