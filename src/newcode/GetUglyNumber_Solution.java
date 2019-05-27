package newcode;

import java.util.ArrayList;

public class GetUglyNumber_Solution {
    public static void main(String[] args) {
        int i = GetUglyNumber_Solution(3);
    }
    //取第n个丑数
    public  static int GetUglyNumber_Solution(int index) {
        if(index == 0) return  0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int i2 = 0 , i3 = 0 , i5 = 0;
        while (list.size() < index){
            // 一个丑数 的 因数
            int m2 = list.get(i2) * 2;
            int m3 = list.get(i3) * 3;
            int m5 = list.get(i5) * 5;
            //每次取最小保证 顺序
            int res = Math.min(m2,Math.min(m3,m5));
            //添加
            list.add(res);
            //更新2的倍数
            if(res == m2){i2++;}
            //更新3的倍数
            if(res == m3){i3++;}
            //更新5的倍数
            if(res == m5){i5++;}
        }
        return list.get(index - 1);
    }
}
