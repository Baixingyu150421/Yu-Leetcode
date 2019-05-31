package Test;

import java.util.HashMap;
import java.util.Map;

public class countPairs {
    public int countPairs(int[] A, int n, int sum) {
        // write code here
        //寻找符合某个值的有序对
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0 ; i < n ; i++){
           count += map.getOrDefault(sum - A[i],0);
           map.put(A[i],map.getOrDefault(A[i],0) + 1);
        }
        return count;
    }
}
