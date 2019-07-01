package oldexams;

import java.util.Scanner;

public class Main62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        while (n >= 5 ){
            count += n / 5;
            n /= 5;
        }
        System.out.println(count);
    }
}
