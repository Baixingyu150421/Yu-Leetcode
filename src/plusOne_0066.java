import java.math.BigInteger;
import java.util.Arrays;

public class plusOne_0066 {
    public static void main(String[] args) {
      int [] nums = {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,};
      int[] ints = plusOne2(nums);
      for (int j :ints){
          System.out.println(j);
      }
    }
    public  static int[] plusOne2(int[] digits) {
        for(int i = digits.length - 1; i >=0 ; i --){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int [digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for(int i : digits) sb.append(i);
        Long result = Long.parseLong(sb.toString()) + 1;
        char[] chars = Long.toString(result).toCharArray();
        int [] newArray = new int[chars.length];
        for(int i = 0 ; i < chars.length ; i++){
            newArray[i] = Integer.parseInt(String.valueOf(chars[i]));
        }
        return newArray;
    }
}
