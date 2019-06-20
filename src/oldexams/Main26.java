package oldexams;


import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String a = sc.next();
            String b = sc.next();
            int xy = rev(a) + rev(b);
            System.out.println(rev(String.valueOf(xy)));
        }
        sc.close();
    }
    public static int rev(String num){
        StringBuilder sb = new StringBuilder(num);
        return Integer.parseInt(sb.reverse().toString());
    }
}
