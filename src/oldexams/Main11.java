package oldexams;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        int len = next.length();
        StringBuilder sb = new StringBuilder(next);
        StringBuilder reverse = sb.reverse();
        String substring = reverse.substring(0, len);
        System.out.println(substring);
    }
}
