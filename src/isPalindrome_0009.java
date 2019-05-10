import java.util.Stack;

/**
 * 判断一个整数是否是回文数，用栈做的，时间复杂度，空间复杂度都不占优势
 */
public class isPalindrome_0009 {
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
