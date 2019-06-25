package oldexams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String substring = next.substring(1, next.length() - 1);
        String[] split = substring.split(",");
        int [] arr = new int[split.length];
        for(int i = 0 ; i < arr.length ;i++){
            arr[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length / 2]);
    }
}
