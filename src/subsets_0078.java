import java.util.ArrayList;
import java.util.List;

public class subsets_0078 {
    public static void main(String[] args) {
     List<List<Integer>> subsets = subsets(new int[]{1, 2, 3});
    }
    public  static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        result.add(list);
        generate(0,nums,result,list);
        return result;
    }
    private static void generate(int i, int[] nums, List<List<Integer>> result, List<Integer> list) {
        if(i >= nums.length) return;
        List res;
        for(int j = i ; j < nums.length ;j++){
            res = new ArrayList(list);
            res.add(nums[j]);
            result.add(res);
            generate(j+1,nums,result,res);
        }
    }
    //位运算
    public  static List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int allSet = 1 << nums.length; //一共有多少中子集
        for(int i = 0; i < allSet ; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0 ; j < nums.length ; j++){
                //i的二进制表示只要有一就表示这位可以添加对应的就是数组的索引位置
                if( ((i >> j) & 1) == 1 ){
                    list.add(nums[j]);
                }
            }
            result.add(list);
        }
        return result;
    }
}
