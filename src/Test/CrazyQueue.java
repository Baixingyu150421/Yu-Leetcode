package Test;

import java.util.Arrays;
import java.util.Scanner;

public class CrazyQueue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int [] arr = null;
        while(input.hasNext()){
            n = input.nextInt();
            arr = new int [n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            int mid = 0;
            if(arr.length % 2 == 0) {mid =  arr.length / 2;}
            else{ mid = (arr.length / 2) + 1 ;  }
            int count = 0;
            for(int a = 0 ; a < mid ; a ++){
                for(int b = mid ; b < arr.length ; b++){
                    count += arr[b] - arr[a];
                }
            }
            System.out.print(count);
        }
    }
}
