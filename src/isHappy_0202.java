public class isHappy_0202 {
    public static void main(String[] args) {
        boolean happy = isHappy(2);
        System.out.println(happy);
    }

    /**
     * 递归栈溢出
     * @param n
     * @return
     */
    public  static boolean isHappy(int n) {
        char[] chars = Integer.toString(n).toCharArray();
        int sum = 0;
        for(char c : chars){
            int i = Integer.parseInt(String.valueOf(c));
            sum += i*i;
        }
        if(sum == 1 ){
            return true;
        }
        if(sum == 4 || sum == 16 || sum == 37 || sum == 58 || sum == 145 || sum == 42 || sum== 20){
            return false;
        }
        return isHappy(sum);
    }
}
