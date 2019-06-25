package oldexams;

import java.util.Scanner;

public class Main41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String[] split = next.split(",");
        int [] arr = new int[split.length];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = Integer.parseInt(split[i]);
        }
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i+1] - arr[i] != 1){
                System.out.println(arr[i] + 1);
                return;
            }
        }
    }
}
