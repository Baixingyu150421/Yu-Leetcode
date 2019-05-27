package newcode;

public class NumberOf1Between1AndN_Solution {
    // 1到n范围内的数字中出现1的次数 暴力解
    public int NumberOf1Between1AndN_Solution1(int n) {
        int count=0;
        StringBuffer s=new StringBuffer();
        for(int i=1;i<n+1;i++){
            s.append(i);
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                count++;
        }
        return count;
    }
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n < 10) return 1;
        int count = 0;
        for(int i = 10 ; i <= n ; i++){
            count += getNum(i);
        }
        return count;
    }
    public int getNum(int a){
        int res = 0;
        while (a != 0){
            if(a % 10 == 1){
                res++;
            }
            a /= 10;
        }
        return res;
    }




}
