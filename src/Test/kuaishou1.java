package Test;

import java.util.Scanner;

public class kuaishou1 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        String s = input.next();
        String [] ss = s.split(",");
        int [] arr = new int[ss.length];
        for(int i = 0 ; i < arr.length ; i++ ){
            arr[i] = Integer.parseInt(ss[i]) ;
        }
        //显然到达第i层的最小花费 = （到i-2层最小花费+第i层花费） /
        // （到i-1层最小花费+第i层花费）的最小值，而最后爬上顶端可以从最后一层或倒数第二层到达
        int [] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = arr[1];
        for(int i = 2 ; i < dp.length ; i++){
            //当前值等于
            dp[i] = Math.min(dp[i - 2] , dp[i - 1]) + arr[i];
        }
        System.out.println(Math.min(dp[dp.length - 1],dp[dp.length - 2]));


//        if(arr.length == 2){
//            System.out.println(Math.min(arr[0],arr[1]));
//        }
//        int cost = 0;
//        for(int i = 2 ; i < arr.length ; i++){
//            arr[i] = Math.min(arr[i - 1],arr[i -2]) + arr[i] ;
//        }
//        System.out.println(Math.min(arr[arr.length - 1] , arr[arr.length - 2]));
    }
}
