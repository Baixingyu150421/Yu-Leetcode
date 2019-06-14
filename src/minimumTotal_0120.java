import java.util.ArrayList;
import java.util.List;
//动态规划
public class minimumTotal_0120 {
    public static int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0) return 0;
        List<List<Integer>> dp = new ArrayList<List<Integer>>();
        List<Integer> list;
        //初始化dp数组
        for(int i = 0; i < triangle.size() ; i++){
            list = new ArrayList<Integer>();
            for(int j = 0 ; j < triangle.get(i).size() ; j++){
                list.add(0);
            }
            dp.add(list);
        }
        //自底向上求解
        for(int i = 0 ; i < triangle.get(triangle.size() - 1).size() ; i++){
            dp.get(dp.size() - 1).set(i,triangle.get(triangle.size() - 1).get(i));
        }
        //递推
        for (int k = triangle.size() - 2 ; k >= 0 ; k--){
            for(int j = 0 ; j < dp.get(k).size() ; j++){
                int res = dp.get(k+1).get(j) > dp.get(k+1).get(j+1) ?
                        dp.get(k+1).get(j+1) + triangle.get(k).get(j):
                        dp.get(k+1).get(j) + triangle.get(k).get(j);
                dp.get(k).set(j,res);
            }
        }
        return dp.get(0).get(0);
    }
}
