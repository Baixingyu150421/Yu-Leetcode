public class reverse_0007 {
    public static void main(String[] args) {
        int reverse = reverse(120);
        System.out.println(reverse);
    }
    /**
     * 整数反转 转char数组 溢出就抛出异常 返回0
     * @param x
     * @return
     */
    public static int reverse(int x) {
        char[] chars = Long.toString(x).toCharArray();
        if(chars[0] != '-'){
            int i = 0 ;
            int j = chars.length - 1;
            while (i < j){
                swap(chars,i++,j--);
            }
            try {
                return Integer.parseInt(String.valueOf(chars));
            }catch (Exception e){
                return 0;
            }
        }
        int i = 1 ;
        int j = chars.length - 1;
        while (i < j){
            swap(chars,i++,j--);
        }
        try {
            return Integer.parseInt(String.valueOf(chars));
        }catch (Exception e){
            return 0;
        }
    }
    public static void swap(char [] chars , int a ,int b){
        char temp = chars[a];
        chars[a] = chars[b];
        chars[b] = temp;
    }
}
