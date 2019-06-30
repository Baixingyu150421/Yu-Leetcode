package oldexams;

import java.util.Arrays;
import java.util.Scanner;

public class Main61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anInt = sc.nextInt();
        int [] dp = new int[60];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2 ; i < dp.length ; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        int i = Arrays.binarySearch(dp, anInt);
        if(i > 0){
            System.out.println(0);
        }else {
            int step = (Math.abs(dp[Math.abs(i) - 2] - anInt)) > (Math.abs(dp[Math.abs(i) - 1] - anInt))
                    ? Math.abs(dp[Math.abs(i) - 1] - anInt) : Math.abs(dp[Math.abs(i) - 2] - anInt);
            System.out.println(step);
        }
    }
}
