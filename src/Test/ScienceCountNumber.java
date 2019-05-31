package Test;

import java.math.BigDecimal;
import java.util.Scanner;

public class ScienceCountNumber {
    //将科学计数法转换为普通输出
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigDecimal bigDecimal = input.nextBigDecimal();
        String s = bigDecimal.toPlainString();
        System.out.println(s);
    }
}
