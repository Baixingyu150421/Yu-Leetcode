package oldexams;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String next = sc.nextLine();
            int res = 0;
            for(int i = 0 ; i < next.length() ; ++i){
                if(next.charAt(i) >= 'A' && next.charAt(i) <= 'Z'){
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
