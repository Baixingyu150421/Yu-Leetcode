package oldexams;

import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String next = input.nextLine();
            String[] s = next.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = s.length - 1; i >= 0; i--) {
                if (i == 0) {
                    sb.append(s[i]);
                } else {
                    sb.append(s[i]).append(" ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
