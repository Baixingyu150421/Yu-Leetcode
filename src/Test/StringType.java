package Test;

import java.util.Scanner;

public class StringType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            //个数至少为一个
            float count = 1;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) != s.charAt(i + 1)) {
                    count++;
                }
            }
            float  a = s.length() / count;
            System.out.println(String.format("%.2f", a));
        }
    }
}
