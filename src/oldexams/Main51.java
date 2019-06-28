package oldexams;

import java.util.Scanner;

public class Main51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        for(int i = 0 ; i < str.length() ; i++){
            for(int j = i + 1 ; j <= str.length() ; j++ ){
                String substring = str.substring(i, j);
                if(checkStr(substring)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static boolean checkStr(String substring) {
        int left = 0;
        int right = substring.length() - 1;
        while (left < right){
            if(substring.charAt(left) != substring.charAt(right)){
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }
}
