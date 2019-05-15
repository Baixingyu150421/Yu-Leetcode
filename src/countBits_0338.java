public class countBits_0338 {
    //计算其二进制数中的 1 的数目并将它们作为数组返回。
    // 思路是若这个数是奇数，那么它就是它前面那个数的值+1 ，否则就是它右移一位的那个数的1bit的个数
    public int[] countBits(int num) {
        int [] count = new int[num + 1];
        for(int i = 1 ; i < count.length ; i++){
            if(i%2 != 0){
                count[i] = count[i - 1] + 1;
            }else{
                count[i] = count[i>>1];
            }
        }
        return count;
    }
}
