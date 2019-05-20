public class isPowerOfThree_0326 {
    public static void main(String[] args) {
        boolean powerOfThree = isPowerOfThree(100);
        System.out.println(powerOfThree);
    }
    //3的幂
    public  static boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        if(n == 1 || n == 3 ) return true;
        if(n < 0 ) return false;
        int res = 0;
        while(n > 1){
            res = n % 3;
            if(res != 0){
                return false;
            }
            n = n /3;
        }
        return true;
    }
}
