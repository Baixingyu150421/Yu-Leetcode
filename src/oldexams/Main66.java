package oldexams;

import java.util.Scanner;

public class Main66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int coin = 1024 - N;
        int res = 0;
        while (coin != 0){
            if(coin >= 64){
                coin -= 64;
                res++;
            }else if(coin >= 16) {
                coin -= 16;
                res++;
            }else if(coin >= 4){
                coin -= 4;
                res++;
            }else {
                coin -= 1;
                res++;
            }
        }
        System.out.println(res);
    }
}
