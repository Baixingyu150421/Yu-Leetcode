import java.util.Scanner;

public class Main35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String move = sc.next();
        int left = 0 , right = 0;
        for(int i = 0 ; i < N ; i++){
            if(move.charAt(i) == 'L'){
                left++;
            }else if(move.charAt(i) == 'R'){
                right++;
            }
        }
        int res = Math.abs(left - right);
        if(left > right){
            int a = res % 4;
            if(a == 0){
                System.out.println("N");
            }else if(a == 1){
                System.out.println("W");
            }else if(a == 2){
                System.out.println("S");
            }else {
                System.out.println("E");
            }
        }else if(left < right){
            int b = res % 4;
            if(b == 0){
                System.out.println("N");
            }else if(b == 1){
                System.out.println("E");
            }else if(b == 2){
                System.out.println("S");
            }else {
                System.out.println("W");
            }
        }else
            System.out.println("N");
    }
}
