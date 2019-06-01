package Test;

import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int [] x = null;
        int [] y = null;
        int res = 0;
        while (input.hasNext()){
            n = input.nextInt();
            x = new int[n];
            y = new int[n];
            for(int i = 0 ; i < n && input.hasNext() ; i++){
                x[i] = input.nextInt();
            }
            for(int j = 0 ; j < n && input.hasNext() ; j++){
                y[j] = input.nextInt();
            }
            for(int k = 1 ; k <= n ; k++ ){
                res = Math.abs(x[k - 1] - k) + Math.abs(y[k - 1] - k);
                if(k == n){
                    System.out.println(res);
                }
                System.out.print(res + " ");
            }
        }
    }
}
