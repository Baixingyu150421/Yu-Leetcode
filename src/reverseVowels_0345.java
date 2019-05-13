import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class reverseVowels_0345 {
    public static void main(String[] args) {
        String hello = reverseVowels("aA");
        //leotcede
        System.out.println(hello);
    }

    /**
     * 最烂解法
     * @param s
     * @return
     */
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        Map<Integer,Character> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < chars.length ; i++ ){
            if(chars[i] == 'a' || chars[i] == 'e' ||chars[i] == 'i' ||chars[i] =='o' ||chars[i] == 'u'||chars[i] == 'A' || chars[i] == 'E' ||chars[i] == 'I' ||chars[i] =='O' ||chars[i] == 'U'  ){
                map.put(i,chars[i]);
                chars[i] = '*';
                stack.push(i);
            }
        }
        for (int i = 0 ; i < chars.length ; i++ ){
            if(chars[i] == '*' && map.containsKey(i)){
                chars[i] = map.get(stack.pop());
            }
        }
        //a,e,i,o,u
        return String.valueOf(chars);
    }
}
