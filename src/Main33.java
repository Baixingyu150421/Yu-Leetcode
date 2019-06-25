import java.util.Scanner;

public class Main33 {
    //统计回文串
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int count = 0;
        StringBuilder sb;
        for(int i = 0 ; i < A.length() ; i++ ){
            sb = new StringBuilder();
            String substring = A.substring(0, i);
            String substring1 = A.substring(i, A.length());
            sb.append(substring).append(B).append(substring1);
            if(isHuiWen(sb.toString())){
                count++;
            }
        }
        StringBuilder ss = new StringBuilder();
        if(isHuiWen(ss.append(A).append(B).toString())){
            count++;
        }
        System.out.println(count);
    }
    public static boolean isHuiWen(String string){
        int left = 0 ;
        int right = string.length() - 1;
        while (left < right){
            if(string.charAt(left) != string.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
