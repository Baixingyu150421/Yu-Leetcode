package oldexams;

import java.util.Scanner;

public class Main53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 5){
            System.out.println(1);
            return;
        }

        int count = 0;
        while (n != 0){
            if(n >= 5 ){
                n -= 5;
                count++;
            }else if( n >= 4){
                n -= 4;
                count++;
            }else if(n >= 3){
                n -= 3;
                count++;
            }else if(n >= 2){
                n -= 2;
                count++;
            }else if(n >= 1){
                n -= 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
