package oldexams;

import java.util.Arrays;
import java.util.Scanner;

public class Main49 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int [] arr = new int[N];
        int hour = 0;
        int min = 0;
        for(int i = 0  ; i < arr.length ; i++){
             hour = sc.nextInt();
             min = sc.nextInt();
            int total = hour * 60 + min;
            arr[i] = total;
        }
        int need = sc.nextInt();
            int hour1 = sc.nextInt();
            int min1 = sc.nextInt();
            int wakeTime = hour1 * 60 + min1 - need;
            Arrays.sort(arr);
            int index = Arrays.binarySearch(arr,wakeTime);
            if(index < 0) index = -(index + 2);
            int res = arr[index];
            int h = res / 60;
            int m = res % 60;
            System.out.print(h);
            System.out.print(" ");
            System.out.print(m);
        }
}
