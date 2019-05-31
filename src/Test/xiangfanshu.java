package Test;

import java.util.Scanner;

public class xiangfanshu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String s = String.valueOf(number);
        StringBuilder sb = new StringBuilder(s);
        int anInt = Integer.parseInt(sb.reverse().toString());
        System.out.println(anInt + number);
    }
}
