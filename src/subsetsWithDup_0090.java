import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class subsetsWithDup_0090 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        result.add(list);
        Arrays.sort(nums);
        generate(0,nums,result,list);
        //去重
        HashSet h = new HashSet(result);
        result.clear();
        result.addAll(h);
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
}
