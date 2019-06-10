package oldexams;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            String next = input.next();
            StringBuilder sb = new StringBuilder(next);
            String substring = sb.reverse().substring(0, next.length() - 2);
            long res = 0;
            for(int i = 0 ; i < substring.length() ; i++){
                if(substring.charAt(i) == 'A'){
                    res += 10 * convert(i);
                }else if(substring.charAt(i) == 'B'){
                    res += 11 * convert(i);
                }else if(substring.charAt(i) == 'C'){
                    res += 12 * convert(i);
                }else if(substring.charAt(i) == 'D'){
                    res += 13 * convert(i);
                }else if(substring.charAt(i) == 'E'){
                    res += 14 * convert(i);
                }else if(substring.charAt(i) == 'F'){
                    res += 15 * convert(i);
                }else {
                    long l = Long.parseLong(String.valueOf(substring.charAt(i)));
                    res += l * convert(i);
                }
            }
            System.out.println(res);
        }
    }

    public static int convert(int i){
        if(i == 0 ) return 1;
        else {
            int res = 1;
            for(int k = 0 ; k < i ; k ++ ){
                res *= 16;
            }
            return res;
        }
    }
}
