package Test;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int [] arr = new int[n];
        while (input.hasNext()){
            n = input.nextInt();
            for(int i = 0 ; i < n && input.hasNext(); i++){
                arr[i] = input.nextInt();
            }

            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < arr.length ; i++ ){
                sb.append(arr[i]);
            }
            

        }


    }
}
