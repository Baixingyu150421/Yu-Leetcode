package newcode;

import java.util.ArrayList;
import java.util.LinkedList;

public class maxInWindows {
    public static void main(String[] args) {
        int [] num = {2,3,4,2,6,2,5,1};
        ArrayList<Integer> list = maxInWindows(num, 3);

    }
    public  static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        //最大值数组
        int [] arr = new int[num.length - size + 1];
        int index = 0;
        if(num == null || size < 1) return list1;
        if(size > num.length) return list1;
        for(int i = 0 ; i < num.length ; i++){
            //队列不为空且新来的值大
            while (!list.isEmpty() && num[list.peekLast()] <= num[i]){
                list.pollLast();
            }
            //正常添加
            list.addLast(i);
            //队头的元素过期
            if(list.peekFirst() == i - size){
                list.pollFirst();
            }
            //窗口已形成 开始存最大值带数组中
            if(i >= size - 1){
                arr[index++] = num[list.peekFirst()];
            }
        }

        for(int a : arr){
            list1.add(a);
        }
        return list1;
    }
}
