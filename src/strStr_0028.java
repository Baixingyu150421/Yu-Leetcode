public class strStr_0028 {
    //给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
    //双指针
    public  static int strStr(String haystack, String needle) {
        if(needle.length() == 0 && haystack.length() == 0 ) return 0;
        if(needle.length() == 0) return 0;
        if(needle.length() > haystack.length()) return -1;
        int i = 0;
        int j = 0;
        while (i < haystack.length()){
            if(j == needle.length()){
                return i - j ;
            }
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
            }else{
                i -= j;
                j = 0;
            }
            i++;
        }
        if(j == needle.length()){
            return i - j ;
        }
        return  -1;
    }

    public static void main(String[] args) {
        //"mississippi"
        //"issipi"
        //"mississippi"
        //"issip"
       String haystack = "mississippi";
       String needle = "issip";
       int i = strStr(haystack, needle);
       System.out.println(i);
    }
}
