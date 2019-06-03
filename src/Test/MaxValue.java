package Test;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[3];
        while (input.hasNext()){
            for(int i =  0 ; i < 3 ; i++){
                arr[i] = input.nextInt();
            }
        }
        Arrays.sort(arr);
        int max = 0;
        if(arr[0] == 1){
            max = (arr[0] + arr[1]) * arr[2] > arr[0] * arr[1] * arr[2]
                    ? (arr[0] + arr[1]) * arr[2] : arr[0] * arr[1] * arr[2];
            System.out.println(max);
        }else {
            max = (arr[0] + arr[1]) * arr[2] > arr[0] * arr[1] * arr[2]
                    ? (arr[0] + arr[1]) * arr[2] : arr[0] * arr[1] * arr[2];
            System.out.println(max);
        }
    }
}
