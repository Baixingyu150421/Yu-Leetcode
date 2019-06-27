package vivo;

public class longestPalindrome_0005 {
    //最长回文子串 中心扩展法
    public String longestPalindrome(String s) {
            int length = s.length();
            if(length > 1){
                int end = 0 , start = 0;
                for(double i = 0.5 ; i < length ; i+= 0.5){
                    //两端
                    int left = (int)(i - 0.5)  , right = (int) (i + 1) ;
                    //满足回文串的结构
                    while (left >= 0 && right < length && s.charAt(left) == s.charAt(right)){
                        //长度变大
                        if(right - left > end - start){
                            start = left;
                            end = right;
                        }
                        //扩展
                        --left;
                        ++right;
                    }
                }
                return s.substring(start,end+1);
            }else return s;
    }

    //方法2 动态规划
    public String longestPalindrome2(String s) {
        if(s.length() == 1) return s;
        int length = s.length();
        boolean [][] dp = new boolean[length][length];
        String str = "";
        for(int i = length - 1 ; i >= 0 ; i--){
            for(int j = i ; j < length ; j++){
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j- i < 2 || dp[i+1][j - 1]);
                if(dp[i][j] && j - i + 1 > str.length() ){
                    str = s.substring(i,j+1);
                }
            }
        }
        return str;
    }
}
