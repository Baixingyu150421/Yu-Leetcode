package vivo;

import java.util.ArrayList;
import java.util.HashSet;
//题目：将array1中array2的数字去掉
//正常输入是两个数组
//vivo提前批 第一题
public class VivoTest1 {
    //for test
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,56,7,6,89};
        int [] array2 = {2,3,4,5,6,7,8};
        solution(array1,array2);
    }
    public static void solution(int [] array1 , int [] array2){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int a : array2){
            set.add(a);
        }
        for(int b : array1){
            if(set.contains(b)){
                continue;
            }else {
                list.add(b);
            }
        }
        for(Integer c : list){
            System.out.print(c + " ");
        }
    }
}
