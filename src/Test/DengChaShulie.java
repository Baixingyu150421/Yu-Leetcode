package Test;

import java.util.Scanner;

public class DengChaShulie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int [] arr = null;
        n = input.nextInt();
        arr = new int[n];
        for(int i = 0 ; i < n  ; i++){
                arr[i++] = input.nextInt();
        }
        boolean flag = true;
        int cha = arr[1] - arr[0];
        for(int i = 0 ; i < arr.length - 1; i++){
            if(arr[i + 1] - arr[i] != cha){
                flag = false;
            }
        }
        if(flag){
            System.out.println("Possible");
        }else {
            System.out.println("Impossible");
        }
    }
}
