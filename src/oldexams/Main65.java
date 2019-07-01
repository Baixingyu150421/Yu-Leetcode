package oldexams;

import java.math.BigInteger;
import java.util.Scanner;

public class Main65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int [] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.nextInt();
        }
        int res = 0;
        BigInteger num = BigInteger.ZERO;
        int j = 0;
        for(int i = 2 ; i < N ; i++ ){
            while (j < i && arr[i] - arr[j] > D){
                j++;
            }
            long choose = i - j;
            if(choose >= 2){
                //求组合数
                num = num.add(BigInteger.valueOf(choose * (choose - 1) / 2));
            }
        }
        long mod = 99997867;
        System.out.println(num.mod(BigInteger.valueOf(mod)));
    }
}
