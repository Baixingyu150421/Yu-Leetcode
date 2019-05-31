package Test;

import java.util.Scanner;

public class caculateArea {
    //计算三角形的面积 和周长
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        double circumference = 0l;
        double area  = 0;
        while (input.hasNext()){
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
        }
        circumference = a + b + c;
        double d = circumference / 2;
        area = Math.sqrt(d * (d - a) * (d - b) * (d - c));
        //保留小数点后两位
        System.out.println("circumference=" + String.format("%.2f", circumference) + " " + "area=" + String.format("%.2f", area));
    }
}
