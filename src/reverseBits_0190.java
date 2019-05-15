public class reverseBits_0190 {
    public static void main(String[] args) {

    }
    //调用库函数
    public int reverseBits1(int n) {
        return Integer.reverse(n);
    }

    //那么就探究一下反转字符数组的本质   先左移再右移
    public int reverseBits2(int n) {
        int a = 0;
        for(int i = 0 ; i < 32 ; i ++ ){
            a = a + (((n>>i)&1)<<(31-i));
        }
        return a;
    }



    //显然会溢出的  转字符数组是不可行的
    public int reverseBits(int n) {
        char[] chars = Long.toBinaryString(n).toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right){
            if(chars[left] == chars[right]){
                left++;
                right--;
                continue;
            }else{
                swap(chars,left++,right--);
            }
        }
        return (int) Long.parseLong(String.valueOf(chars));
    }
    public static void swap(char [] chars , int a ,int b){
        char temp = chars[a];
        chars[a] = chars[b];
        chars[b] = temp;
    }
}
