package oldexams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        while (input.hasNext()){
            for(int i = 0 ; i < n  ; i++){
                arr[i] = input.nextInt();
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            set.add(arr[i]);
        }
        int [] a = new int[set.size()];
        int b = 0;
        for(Integer i : set){
            a[b++] = i;
        }
        Arrays.sort(a);
        for(int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }
    }
}
