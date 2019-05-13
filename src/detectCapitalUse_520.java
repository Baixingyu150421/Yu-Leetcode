public class detectCapitalUse_520 {
    public static void main(String[] args) {
        //USA
        //Google
        //leetcode
        //UsAa
        boolean usa = detectCapitalUse("h");
        System.out.println(usa);
    }

    /**
     * 逻辑判断
     * @param word
     * @return
     */
    public static boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        if(chars.length == 1) return true;
        if(97 <= chars[0] &&  122 >= chars[0]){
            for(int i = 1 ; i < chars.length ;i++){
                if( chars[i] >= 65 && chars[i] <= 90){
                    return false;
                }
            }
        }else {
            //第二个是小写
            if (97 <= chars[1] && 122 >= chars[1]) {
                for (int i = 2; i < chars.length; i++) {
                    if (chars[i] >= 65 && chars[i] <= 90) {
                        return false;
                    }
                }
            }else {
                for (int i = 2; i < chars.length; i++) {
                    if (chars[i] >= 97 && chars[i] <= 122) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
