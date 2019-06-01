package Test;

import java.util.Scanner;

public class Life {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //房费
        int x = 0;
        //苹果数
        int f = 0 ;
        //生活费
        int d = 0;
        //苹果价格
        int p = 0;
        while (input.hasNext()){
            x = input.nextInt();
            f = input.nextInt();
            d = input.nextInt();
            p = input.nextInt();
        }

        if(f >= (d / x)){
            System.out.println(d / x);
        }else{
            d -= x * f;
            int count = 0;
            while (d >= (x + p)){
                d -= (x + p);
                count++;
            }
            System.out.println( f + count);
        }

    }
}
