import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring_0003 {
    public static void main(String[] args) {
        int i = lengthOfLongestSubstring( "abcabcbb" );
        System.out.println(i);
    }
    //滑动窗口,使用map结构  遇到相等的字符就把队列长度减1
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s.length() == 1 ) return s.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            //更新窗口最大值
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}
