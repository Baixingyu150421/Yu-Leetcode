package oldexams;

import java.util.Arrays;
import java.util.Scanner;

public class Main37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        while (sc.hasNext()){
            for(int i = 0 ; i < n ; i++) {
                String next = sc.next();
                String substring = next.substring(next.length() - 6, next.length());
                arr[i] = Integer.parseInt(substring);
            }
        }
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
