package oldexams;

import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();
        String string = Integer.toBinaryString(nextInt);
        int result = 0;
        for(int i = 0 ; i < string.length() ; i++){
            if(string.charAt(i) == '1'){
                result++;
            }
        }
        System.out.println(result);
    }
}
