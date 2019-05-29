package newcode;

public class NumberOf1 {
    public int NumberOf1(int n) {
        if( n == Integer.MIN_VALUE) return 1;
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        int count = 0;
        for(int i = 0; i < chars.length ; i++){
            if(chars[i] == '1'){
                count++;
            }
        }
        return count;
    }

    //正解

    public int NumberOf12(int n) {
        int sum=0;
        while(n!=0){
            sum+=n&1;//逐个判断低位是否为1；
            n=n>>>1;//无符号右移，例如从11101变成1110
        }
        return sum;
    }
}
