import java.util.Stack;

/**
 * 判断一个整数是否是回文数，用栈做的，时间复杂度，空间复杂度都不占优势
 */
public class isPalindrome_0009 {

    //法二： 双指针
    public static boolean isPalindrome2(int x) {
        String s = Integer.toString(x);
        int start = 0 , end = s.length() - 1;
        while (start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end --;
        }
        return true;
    }

    public static boolean isPalindrome(int x) {
        char[] charArray = Integer.toString(x).toCharArray();
        if(charArray.length == 1) return true;
        Stack<Character> characterStack = new Stack<>();
        int middle = charArray.length / 2;
        if(charArray.length  % 2 == 0){
            for(int i = 0 ; i < middle ; i++ ){
                characterStack.push(charArray[i]);
            }
            for(int j = middle; j < charArray.length ; j++ ){
                if(charArray[j] != characterStack.pop()){
                    return false;
                }
            }
        }else {
            for(int i = 0 ; i < middle ; i++ ){
                characterStack.push(charArray[i]);
            }
            for(int j = middle + 1; j < charArray.length ; j++ ){
                if(charArray[j] != characterStack.pop()){
                    return false;
                }
            }
        }
        return true;
    }
}
