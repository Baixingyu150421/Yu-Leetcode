public class countPrimes_0204 {
    public static void main(String[] args) {
        int i = countPrimes(100);
        System.out.println(i);
    }
    //计数质数  从2开始 把其倍数都置为true 并计数 依次类推 最终剩下的就都是质数了
    public static int countPrimes(int n) {
        if(n < 2) return 0;
       // if(n == 2) return 1;
        int count = 0;
        boolean [] b = new boolean[n];
        for(int i = 2 ; i < n ; i ++){
            int result = i;
            while(result < n){
                result += i;
                if(result < n){
                    if( b[result - 1] == true){
                        continue;
                    }
                    b[result - 1] = true;
                    count++;
                }else {
                    break;
                }
            }
        }
        return n - count - 2;
    }
}

