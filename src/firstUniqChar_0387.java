public class firstUniqChar_0387 {
    public static void main(String[] args) {
        int leetcode = firstUniqChar("leetcode");
        System.out.println(leetcode);
    }
    //s = "leetcode" 0
    public  static  int firstUniqChar(String s) {
        if(s == null) return -1;
        char[] chars = s.toCharArray();
        int [] newArray = new int[chars.length];
        for(int i = 0 ; i < chars.length ; i++){
            int count = 1;
            for(int j = 0 ; j < chars.length ; j++){
                if(i == j) continue;
                if(chars[j] == chars[i]){
                    if(count > 1){
                        break;
                    }
                    count++;
                }
            }
            newArray[i] = count;
        }
        for(int i = 0 ; i < newArray.length ;i++){
            if(newArray[i] == 1){
                return i;
            }
        }
        return -1;
    }
}
