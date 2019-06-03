package Test;

import java.util.Scanner;

public class Bilibili1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        int anInt = Integer.parseInt(next);

        StringBuilder sb = new StringBuilder();
        while ( anInt >= 1){
            if(anInt  % 2 == 0 ){
                anInt = (anInt - 2) / 2;
                sb.append("3");
            }else {
                anInt = (anInt - 1)/ 2;
                sb.append("2");
            }
        }
        System.out.println(sb.reverse().toString());
    }
}
