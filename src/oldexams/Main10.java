package oldexams;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nextInt = input.nextInt();
        String s = String.valueOf(nextInt);
        StringBuilder sb = new StringBuilder(s);
        System.out.println(Integer.parseInt(sb.reverse().toString()));
    }
}
