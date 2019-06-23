public class minWindow_0076 {
    public String minWindow(String s, String t) {
        int count = 0, left = 0, right = 0, tcount = t.length();
        int[] tHash = new int[128], sHash = new int[128];
        int len = Integer.MAX_VALUE, minLeft = 0;
        for(char val : t.toCharArray()){
            tHash[val] ++ ;
            if(tHash[val] > 1) tcount --;
        }
        for(char val : s.toCharArray()){
            sHash[val] ++ ;
            if(sHash[val] == tHash[val]) count ++;
            while (left <= right && sHash[s.charAt(left)] > tHash[s.charAt(left)]) {
                sHash[s.charAt(left)] -- ;
                left ++ ;
            }
            if(count >= tcount){
                int temp = right - left + 1;
                if(temp < len){
                    minLeft = left;
                    len = temp;
                }
            }
            right ++;
        }
        if(len != Integer.MAX_VALUE)
            return s.substring(minLeft, len + minLeft);
        else
            return "";
    }
}
