
//给出一个单词列表，其中每个单词都由小写英文字母组成。
//如果我们可以在 word1 的任何地方添加一个字母使其变成 word2，那么我们认为 word1 是 word2 的前身。例如，"abc" 是 "abac" 的前身。
//词链是单词 [word_1, word_2, ..., word_k] 组成的序列，k >= 1，其中 word_1 是 word_2 的前身，word_2 是 word_3 的前身，依此类推。
//从给定单词列表 words 中选择单词组成词链，返回词链的最长可能长度。
// 输入：["a","b","ba","bca","bda","bdca"]
//输出：4
//解释：最长单词链之一为 "a","ba","bda","bdca"。
public class longestStrChain_5065 {
    public static void main(String[] args) {
        String [] words = {"a","b","ba","bca","bda","bdca"};
     //  boolean b = hasCharacter("ba", "bca");
     //   System.out.println(b);
        int i = longestStrChain(words);
        System.out.println(i);
    }
    public static int longestStrChain(String[] words) {
        int Count = 1;
        int Max = 0;
        for(int i = 0 ; i < words.length ; i++){
            //String cur = words[i];
            String temp = words[i];
            Count = 1;
            for(int j = 0;  j < words.length ; j++){
                if(hasCharacter(words[j],temp)){
                    temp = words[j];
                    Count++;
                }
            }
            Max = Math.max(Max,Count);
        }
        return Max - 1;
    }
    public static boolean  hasCharacter (String a , String b){
        char[] chars1 = a.toCharArray();
        char[] chars = b.toCharArray();
        for(int i = 0 ; i < chars.length ; i++){
            int j = 0;
            for( ; j < chars1.length ; j++){
                if(chars[i] == chars1[j]){
                    break;
                }else {
                    if(j == chars1.length - 1){
                        return false;
                    }
                    continue;
                }
            }
        }
        return true;
    }
}
