package oldexams;

import java.util.Scanner;

public class Main30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.next();
            String s2 = sc.next();
            if(s2.length() > s1.length()){
                System.out.println("No");
                return;
            }
            else if(s1.length() == s2.length()){
                if(s1.equals(s2)){
                    System.out.println("Yes");
                    return;
                }else {
                    System.out.println("No");
                    return;
                }
            }else {
                int index = 0;
                int index2 = 0;
                while (index != s2.length()){
                    if(s2.charAt(index) != s1.charAt(index2) && index2 == s1.length() - 1){
                        System.out.println("No");
                        return;
                    }
                    if(s2.charAt(index) != s1.charAt(index2)){
                            index2++;
                    }else {
                        index++;
                        index2++;
                    }
                }
                System.out.println("Yes");
                return;
            }
        }
        sc.close();
    }
}
