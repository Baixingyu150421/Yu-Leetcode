package Test;

import java.util.Scanner;

public class MaxArea {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int [] arr = new int[n];
//        for(int i = 0 ; i < n ; i++){
//            arr[i] = input.nextInt();
//        }
        int n = 6;
        int [] arr = {6,2,5,4,5,1,6};
        solution(n,arr);
    }

    public static void solution(int n , int [] height){
        int left = n / 2 - 1;
        int right =n / 2 ;
        while (left > 0 && right < height.length - 1) {
            int min = Math.min(height[left], height[right]);
            int area = (right - left) * min;
            if(height[left - 1] == height[right] ){

            }
        }

    }
}
