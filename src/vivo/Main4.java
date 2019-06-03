package vivo;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        int [][] dp = new  int[a.length()][b.length()];
        int max = 0;
        String res = "";
        for(int i = 0 ; i < a.length() ; i++){
            for(int j = 0 ; j < b.length() ; i++){
                if(a.charAt(i) == b.charAt(j)){
                    if(i == 0 || j == 0){
                        dp[i][j] = 1;
                    }else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                    if(dp[i][j] > max){
                        max = dp[i][j];
                        //左闭右开
                        res = a.substring(i - dp[i][j] + 1 , i + 1);
                    }
                }
            }
        }
        System.out.println(res);
    }
}
