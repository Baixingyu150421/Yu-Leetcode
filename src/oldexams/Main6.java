package oldexams;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long num = scanner.nextLong();
            for (int i = 2; i <= num; ) {
                if ((num/i)*i == num) {
                    num = num/i;
                    System.out.print(i+" ");
                }else
                    i++;
            }
        }
    }
}
