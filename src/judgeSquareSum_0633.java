public class judgeSquareSum_0633 {
    public static void main(String[] args) {
        boolean b = judgeSquareSum(1000000000);
        System.out.println(b);
    }
    public static boolean judgeSquareSum(int c) {
        if(c == 1) return true;
        int a = 0 ;
        int b = (int) Math.sqrt(c) + 1;
        while(a <= b){
            if(a * a == c){return true;}
            if(b * b == c){return true;}
            int sum = (a * a) + (b * b);
            if(sum == c){
                return true;
            }else if(sum > c){
                b--;
            }else{
                a++;
            }
        }
        return false;
    }
}
