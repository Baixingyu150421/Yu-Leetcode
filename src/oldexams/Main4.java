package oldexams;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        process(a);
        process(b);
    }
    public static void process(String str){
        StringBuilder sb = new StringBuilder(str);
        if(sb.length() % 8 != 0){
            int a = 8 - sb.length() % 8;
            for(int i = 0 ; i < a ; i++){
                sb.append("0");
            }
        }
        int k = sb.length() / 8;
        for(int j = 0 ; j < k ; j++){
            String substring = sb.substring(0 + j * 8, (j + 1) * 8);
            System.out.println(substring);
        }
    }
}
