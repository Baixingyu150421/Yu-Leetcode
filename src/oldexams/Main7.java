package oldexams;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float v = sc.nextFloat();
        String string = Float.toString(v);
        int i = string.indexOf(".");
        if(Integer.parseInt(String.valueOf(string.charAt(1 + i))) >= 5 ){
            System.out.println(Integer.parseInt(string.substring(0,i)) + 1);
        }else {
            System.out.println(Integer.parseInt(string.substring(0,i)));
        }
    }
}
