package vivo;

import java.io.*;
import java.util.*;
class Test {
}
public class Main {
    //next()不会得到带空格的字符串，而nextLine()可以得到带空格的字符串。
    public static void main(String args[]) {
        //获取键盘输入
        int[] nums = null;
        int target = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            //杯数
            int n = in.nextInt();
            //构造每杯的数组
            nums = new int[n];
            //凑不成两杯
            if (n < 2) {
                System.out.println("NO");
            } else {
                //数组赋值
                for (int i = 0; i < n; i++) {
                    nums[i] = in.nextInt();
                }
                //每天需要的总量
                target = in.nextInt();
            }
        }
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = null;
        Arrays.sort(nums);
        int start = 0 , end = nums.length - 1;
        while (start < end){
            if(nums[start] + nums[end] > target){
                end--;
            }else if(nums[start] + nums[end] < target){
                start++;
            }else if(nums[start] + nums[end] == target){
                list = new ArrayList<>();
                list.add(nums[start]);
                list.add(nums[end]);
                lists.add(list);
                if(nums[end] - nums[end - 1] >  nums[start + 1] - nums[start]){
                    start++;
                }else{
                    end --;
                }
            }
        }
        if(lists == null || lists.size() < 1){
            System.out.println("NO");
        }
        for(List<Integer> a :  lists){
            Integer integer = a.get(0);
            Integer integer1 = a.get(1);
            System.out.println(integer + " " + integer1);
        }
    }
}