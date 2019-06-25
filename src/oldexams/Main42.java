package oldexams;

import java.util.Scanner;

public class Main42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int i = 0;
        while (sc.hasNext()){
            arr[i++] = sc.nextInt();
        }
        int [] dp = new int[n];
        dp[0] = arr[0];
        int max = Integer.MIN_VALUE;
        for(int j = 1 ; j < arr.length ; j++ ){
            dp[j] = Math.max(dp[j - 1] + arr[j] , arr[j]);
            max = Math.max(max,dp[j]);
        }
        System.out.println(max);
    }
}
