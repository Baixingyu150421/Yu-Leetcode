package Test;

import java.util.Scanner;

public class MaxSubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();

        int max = 0;
        int[][] dp = new int[len1+1][len2+1];
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(str1.charAt(i)!=str2.charAt(j)){
                    dp[i+1][j+1] = 0;
                }else{
                    //状态方程
                    dp[i+1][j+1] = dp[i][j] + 1;
                }
                max = Math.max(dp[i+1][j+1], max);
            }
        }
        System.out.println(max);
    }
}
