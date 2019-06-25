package oldexams;

import java.util.Arrays;
import java.util.Scanner;

public class Main31 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            int a = 0;
            int [] dp = new int[number];
            for(int i = 0 ; i < number; i++){
                int num = input.nextInt();
                dp[i] = a + num;
                a = dp[i];

            }
            int query = input.nextInt();
            int [] arr = new int[query];
            for(int j = 0 ; j < query ; j++){
                arr[j] = input.nextInt();
            }
            for(int index = 0 ; index < query ; index++){
                int i = Arrays.binarySearch(dp, arr[index]);
                if(i > 0){
                    System.out.println(i + 1);
                }else {
                    System.out.println(-i);
                }
            }
    }
}
