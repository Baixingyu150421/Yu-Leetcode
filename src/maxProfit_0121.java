public class maxProfit_0121 {
    public static void main(String[] args) {
        int [] num = {7,1,5,3,6,4};
        int i = maxProfit(num);
        System.out.println(i);
    }

    public int maxProfit2(int[] prices) {
        if(prices.length==0) return 0;
        int min=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            //不断刷新最小值
            min=Math.min(min,prices[i]);
            //不断更新最大利润
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }
    //两次遍历
    public static int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int max = 0;
        for(int i = 0 ; i < prices.length ; i ++){
            for(int j = i + 1  ; j <prices.length ; j++){
                if(prices[j] > prices[i]){
                    max = Math.max(max,prices[j] - prices[i]);
                }
            }
        }
        return max;
    }
}
