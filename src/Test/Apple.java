package Test;

import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //苹果堆数
        int n = 0;
        int m = 0;
        while (input.hasNext()){
            n = input.nextInt();
            //每堆的个数
            int [] arr = new int[n];
            for(int i = 0 ; i < arr.length ; i++){
                arr[i] = input.nextInt();
            }
            //m次查询
            m = input.nextInt();
            //每次查询第几个
            int [] a = new int[m];
            for(int i = 0 ; i < a.length ; i++ ){
                a[i] = input.nextInt();
            }
            //遍历查询数组
            for(int j = 0 ; j < a.length ; j++){
                for(int k = 0 ; k < arr.length ; k++){
                    if(arr[j] <= arr[k]){
                        System.out.println(k+1);
                    }else {
                        arr[j] -= arr[k];
                        continue;
                    }
                }
            }
        }
    }
}
