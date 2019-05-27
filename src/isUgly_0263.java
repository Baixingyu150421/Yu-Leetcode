public class isUgly_0263 {
    //递归判断一个数是不是丑数   判断丑数
    public boolean isUgly(int num) {
        if(num == 0) return false;
        if(num == 1) return true;
        if(num%2==0) return isUgly(num/2);
        if(num%3==0) return isUgly(num/3);
        if(num%5==0) return isUgly(num/5);
        return false;
    }
}
