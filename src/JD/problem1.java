package JD;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [] arr1 = new int[n];
            int [] arr2 = new int[m];
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0 ; i < arr1.length ;i++) {
                arr1[i] = sc.nextInt();
                set.add(arr1[i]);
            }
            for(int j = 0 ; j < arr2.length ;j++){
                arr2[j] = sc.nextInt();
                set.add(arr2[j]);
            }
            int [] res = new  int[set.size()];
            int i = 0;
                Iterator<Integer> iterator = set.iterator();
                while (iterator.hasNext()){
                    res[i ++] = iterator.next();
                }
            Arrays.sort(res);
            for(Integer index : res){
                System.out.print(index + " ");
            }
        }
    }
}
