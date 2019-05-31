package Test;

import java.util.Scanner;

public class MagicYingBi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        count =  input.nextInt();
        process(10);
    }
    public static void process(int count){
        if(count == 0) return;
        int cur = count;
        StringBuilder sb = new StringBuilder();
        while (cur >= 1){
            if(cur % 2 == 0 ){
                cur = (cur - 2) / 2;
                sb.append("2");
            }else {
                cur = (cur - 1) / 2;
                sb.append("1");
            }
        }
        System.out.println(sb.reverse().toString());
    }
}
