package Test;

import java.util.Scanner;

public class MeiTuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int res = 1;
        for(int i = 1 ; i < n ; i++){
            res *= 2;
        }
        System.out.println(res);
    }
}
