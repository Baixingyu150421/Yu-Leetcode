public class getSum_0371 {
    public static void main(String[] args) {
        int sum = getSum(-2, 3);
        System.out.println(sum);
    }
    public static int getSum(int a, int b) {
        int num1 = a;
        int num2 = b;
        if(num1 == 0 && num2 == 0) return 0;
        if(num1 == 0) return num2;
        if(num2 == 0) return num1;
        if( num1 > 0){
            while (num1 != 0){
                --num1;
                ++num2;
            }
            return num2;
        }else {
            while (num1 != 0){
                ++num1;
                --num2;
            }
            return num2;
        }
    }
}
