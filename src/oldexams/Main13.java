package oldexams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();
        int i = 0;
        String [] s = new String[nextInt];
        while (sc.hasNext()){
            s[i++] = sc.next();
        }
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for(int k = 0 ; k < s.length ; k++){
            System.out.println(s[k]);
        }
    }
}
