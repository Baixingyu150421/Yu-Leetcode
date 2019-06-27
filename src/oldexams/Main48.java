package oldexams;

import java.util.Scanner;

public class Main48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int number = sc.nextInt();
            for(int i = 0 ; i < number ; i++){
                int length = sc.nextInt();
                String str = sc.next();
                int count = 0;
                for(int j = 0 ; j < str.length() ;j++){
                    if(str.charAt(j) == '.'){
                        count++;
                        j += 2;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
