package oldexams;

import java.util.Scanner;

public class Main27 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while (sc.hasNext()){
            String next = sc.next();
            String[] s = next.split(" ");
            StringBuilder sb = new StringBuilder();
            for(int i = s.length - 1 ; i >=0 ;i++){
                if(i == 0){
                    sb.append(s[i]);
                }
                sb.append(s[i] + " ");
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
