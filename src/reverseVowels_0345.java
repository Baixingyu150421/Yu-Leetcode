import java.util.*;

public class reverseVowels_0345 {
    public static void main(String[] args) {
        String hello = reverseVowels2("aA");
        //leotcede
        System.out.println(hello);
    }
    //双指针
    public static String reverseVowels2(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
        int i = 0; int j = s.length() - 1;
        char [] ch = s.toCharArray();
        while (i < j){
            if(set.contains(s.charAt(i) ) && set.contains(s.charAt(j))){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
            }else if(set.contains(s.charAt(i) )){
                j --;
                continue;
            }else if(set.contains(s.charAt(j))){
                i++;
                continue;
            }
                j--;
                i++;
        }
        return String.valueOf(ch).toString();
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
