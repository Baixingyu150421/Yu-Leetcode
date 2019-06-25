package oldexams;

import java.util.Scanner;

public class Main32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] x = new int[n];
        int [] y = new int[n];
        for(int i = 0 ; i < n ; i++){
            x[i] = sc.nextInt();
        }
        for(int j = 0 ; j < n ; j ++){
            y[j] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int index = 0; index < n ; index++ ){
            min = Math.min(min,x[index] +y[index]);
        }
        System.out.println(min - 2);
    }
}
