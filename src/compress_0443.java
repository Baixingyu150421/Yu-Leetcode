public class compress_0443 {
    //["a","a","b","b","c","c","c"]
    //["a","2","b","2","c","3"]
    public static void main(String[] args) {
        char[] chars ={'a','a','b','b','c','c','c'};
        int compress = compress(chars);
        System.out.println(compress);
    }

    /**
     * 没理解题意   压缩字符串
     * @param chars
     * @return
     */
    public  static int compress(char[] chars) {
        if(chars.length == 1)return 1;
        int res = 0;
        int count = 1;
        for(int i = 0 ; i < chars.length - 1 ; i++){
            if(chars[i] == chars[i+1]){
                count++;
                continue;
            }
            if(count >= 2 ){
                if(count < 10){
                    res += count - 2;
                }else {
                    res +=  count - Integer.toString(count).length() - 1;
                }
            }
            count = 1;
        }
        if(count >= 2){
            if(count < 10){
                res += count - 2;
            }else {
                res +=  count - Integer.toString(count).length() - 1;
            }
        }
        return chars.length - res;
    }
}
