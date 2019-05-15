import java.math.BigInteger;

public class hammingWeight_0191 {
    public static void main(String[] args) {
        int i = hammingWeight2(22);
        System.out.println(i);
    }



    //一个数的二进制中1的个数  溢出
    public  static int hammingWeight(int n) {
        long num =  n;
        if(num == 0) return 0;
        if(n == 1) return 1;
        if(n > 1){
            if(n%2 != 0){
                return hammingWeight( n - 1) + 1;
            }else{
                return hammingWeight( n >> 1);
            }
        }
        return 0;
    }
    //转字符数组输出
    public static int hammingWeight2(int n) {
        char[] chars = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        for(int i = 0 ; i < chars.length ; i++){
            if(chars[i] == '1'){
                count++;
            }
        }
        return count;
    }
}
