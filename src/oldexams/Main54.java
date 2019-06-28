package oldexams;

import java.util.Arrays;
import java.util.Scanner;

public class Main54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int [] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        Arrays.sort(arr);
        System.out.println(Math.abs(arr[1] - arr[0]) + Math.abs(arr[1] - arr[2]));
    }
}
