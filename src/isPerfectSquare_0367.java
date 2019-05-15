public class isPerfectSquare_0367 {
    public static void main(String[] args) {
        boolean perfectSquare = isPerfectSquare4(808201);
        System.out.println(perfectSquare);
    }
    //暴力查找
    public static boolean isPerfectSquare4(int num) {
        if(num == 1) return true;
        for(int i = 0 ; i < num / 2 ; i++){
            if(i*i == num){
                return true;
            }
        }
        return false;
    }


    //二分查找 超时
    public static boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while (left <= right){
            int middle = left + ((right - left)>>1);
            if((middle *  middle) == num){
                return true;
            }else if((middle *  middle) > num ){
                right = middle - 1;
            }else {
                left = middle+ 1;
            }
        }
        return false;
    }

    /**
     * 库函数
     * @param num
     * @return
     */
    public static boolean isPerfectSquare2(int num) {
        double sqrt = Math.sqrt(num);
        char[] chars = Double.toString(sqrt).toCharArray();
        int i = Double.toString(sqrt).indexOf(".");
        for( i = i + 1; i < chars.length ; i++){
            if(chars[i] != '0'){
                return false;
            }
        }
        return true;
    }

    /**
     * 牛顿迭代法
     * @param num
     * @return
     */
    public static boolean isPerfectSquare3(int num){
        if(num == 1) return true;
        long r = num;
        while ((r * r) > num){
            r = (r +( num / r)) / 2;
        }
        if(r * r == num) {
            return true;
        }
        return false;
    }
}
