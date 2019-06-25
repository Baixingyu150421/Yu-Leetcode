package oldexams;

import java.util.Scanner;

public class Main33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int workNumber = sc.nextInt();
        int friend = sc.nextInt();
        int [] difficult = new int[workNumber];
        int [] profit = new int[workNumber];
        for(int i = 0 ; i < difficult.length ; i++ ){
            difficult[i] = sc.nextInt();
            profit[i] = sc.nextInt();
        }
        int [] arr = new int[friend];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        //方法超时
        for(int i = 0 ; i < arr.length ; i++){
            for(int k = 0 ; k < difficult.length ; k++){
                if(difficult[k] > arr[i]){
                    System.out.println(profit[k -1]);
                    break;
                }else if(difficult[k] == arr[i]){
                    System.out.println(profit[k]);
                    break;
                }
            }
        }
    }
}
