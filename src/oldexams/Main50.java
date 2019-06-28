package oldexams;

import java.util.Arrays;
import java.util.Scanner;

public class Main50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int [] arr = new  int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        Arrays.sort(arr);
        int res = a * b * c;
        int max = res > (arr[0] + arr[1]) * arr[2] ? res : (arr[0] + arr[1]) * arr[2];
        System.out.println(max);
    }
}
