package Test;

import java.util.Scanner;

public class ColorZhuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = null;
        while (input.hasNext()){
            str = input.next();
        }
        int [] chars = new int[26];
        for(int i = 0 ; i < str.length() ; i++){
            chars[str.charAt(i) - 'A'] ++;
        }
        int count = 0;
        for(int j = 0 ; j < chars.length ; j++){
            if(chars[j] != 0){
                count++;
            }
        }
        if(count > 2) System.out.println(0);
        if(count <= 2) System.out.println(count);;
    }
}
