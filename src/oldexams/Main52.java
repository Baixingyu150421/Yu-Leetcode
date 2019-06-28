package oldexams;

import java.util.Scanner;

public class Main52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] split = str.split(";");
        StringBuilder sb ;
        for(int i = 1 ; i < split[0].length() ; i++){
            String s1 = split[0].substring(0, i);
            String s2 = split[0].substring(i, split[0].length());
            sb = new StringBuilder();
            StringBuilder builder = sb.append(s2).append(s1);
            if(builder.toString().equals(split[1])){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}
