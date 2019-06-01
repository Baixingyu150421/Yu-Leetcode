package Test;

import java.util.Scanner;

public class MyString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        int count = 1;
        int Max = 1;
        while (scanner.hasNext()){
            str = scanner.next();
            char [] ch = str.toCharArray();
            for(int i = 0 ; i < ch.length - 1 ; i++){
                if(ch[i + 1] != ch[i]){
                    count ++;
                }else {
                    Max = Math.max(Max,count);
                    count = 1;
                }
            }
            System.out.println(Max );
        }
    }
}
