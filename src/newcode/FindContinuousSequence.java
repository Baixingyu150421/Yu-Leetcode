package newcode;

import java.util.ArrayList;

public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>>  res = new ArrayList<ArrayList<Integer>>();
        //两个起点
        int low = 1;
        int high = 2;
        //退出条件
        while (high > low){
            //求窗口内的和
            int  temp =( (low + high) * (high - low + 1) )/ 2;
            //相等就要添加
            if(temp == sum){
                ArrayList<Integer> list = new ArrayList<>();
                for(int i = low ; i <= high ; i++){
                    list.add(i);
                }
                res.add(list);
                low++;
                //大就把窗口缩小
            }else if(sum > temp){
                high++;
                //否则就加大
            }else {
                low++;
            }
        }
        return res;
    }
}
