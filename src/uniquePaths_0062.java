public class uniquePaths_0062 {
    public static void main(String[] args) {
        int i = uniquePaths(3, 2);
        System.out.println(i);
    }
    public static int uniquePaths(int m, int n) {
       //总移动次数
        int sum = m + n - 2;
        //向下移动次数
        int down =  m - 1;
        long res = 1;
        for(int i = 1 ; i <= m - 1 ; i++){
            res = res * (sum - down + i) / i;
        }
        return (int) res;
    }
}
