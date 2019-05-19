public class maxProfit_0122 {
    public static void main(String[] args) {
        int[] prices = {6,1,3,2,4,7};
        int i = maxProfit(prices);
        System.out.println(i);
    }

        //最大利润 贪心算法
        public static int maxProfit(int[] prices) {
            if(prices.length < 2) return 0;
            int profit = 0;
            int yesterday = prices[0];
            for(int a : prices){
                //今天比昨天价格高就卖
                if( a > yesterday){
                    profit += a - yesterday;
                }
                yesterday = a;
            }
            return profit;
    }
}

