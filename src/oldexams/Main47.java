package oldexams;

import java.math.BigInteger;
import java.util.Scanner;

public class Main47 {
    public static String climbStairs(int n){
        BigInteger prev = new BigInteger(String.valueOf(0));
        BigInteger cur = new BigInteger(String.valueOf(1));
        for(int i=1; i<=n; i++){
            BigInteger tmp = new BigInteger(cur.toString());
            cur = cur.add(prev);
            prev = tmp;
        }
        return cur.toString();
    }
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Main47.climbStairs(n));
    }
}
