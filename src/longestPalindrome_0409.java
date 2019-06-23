public class longestPalindrome_0409 {
    public static int longestPalindrome(String s) {
        int [] arr = new int[58];
        int res = 0;
        int index = 0;
        int res2 = 0;
        int count = 0;
        int count2 = 0;
        for(int i = 0 ;  i < s.length() ;i++ ){
            arr[ Integer.valueOf(s.charAt(i)) - 65] += 1 ;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0) continue;
            if(arr[i] % 2 == 0){
                res+=arr[i];
                count++;
            }else {
                count2++;
                index = Math.max(index,arr[i]);
                res2 += arr[i] - 1;
            }
        }
        if(count >= 1 && res != 0 && count2 == 0) return res;
        if(count2 == 1 && count == 0) return index;
        if(count == 0 && count2 > 1) return index + res2 - index + 1;
        else return res + index + res2 - index + 1;
    }

    public static void main(String[] args) {
        int abccccdd = longestPalindrome("tattarrattat");
        System.out.println(abccccdd);
    }
}
