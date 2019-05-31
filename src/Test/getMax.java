package Test;

public class getMax {
    //两个数的最大值
    public int getMax(int a, int b) {
        // write code here
        return ( a + b + Math.abs(a - b)) / 2;

    }
    //位运算
    public int getMax2(int a ,int b){
        b = a-b;//此时b>>31为1则b小于0即a<b,若b>>31为0 则a>b
        a -= b&(b>>31); //若a<b a=a-(a-b),若a>b a=a-0
        return a;
    }
}
