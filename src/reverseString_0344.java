public class reverseString_0344 {
    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};
        reverseString2(s);
        for(Character c : s){
            System.out.print(c + " ");
        }
    }
    //法2： 双指针
    public static void reverseString2(char[] s) {
        if(s == null || s.length < 1) { System.out.println(""); }
        if(s.length == 1) { System.out.println(s); }
        int left = 0; int right = s.length - 1;
        while (left < right){
            swap(left++,right--,s);
        }
    }


    //法1：
    public void reverseString(char[] s) {
        if(s == null || s.length < 1) {
            System.out.println("");
        }
        if(s.length == 1) {
            System.out.println(s);
        }
        //奇数个
        if(s.length % 2 != 0 && s.length > 1) {
            int middle = s.length >> 1;
            int i = 0 ;
            int j = s.length - 1;
            while(i < middle && j > middle) {
                swap(i++ , j-- ,s);
            }
        }
        if(s.length % 2 == 0 && s.length > 1){
            int middle = s.length >> 1;
            int i = 0 ;
            int j = s.length - 1;
            while(i < middle && j >= middle ) {
                swap(i++ , j-- ,s);
            }
        }
    }

    public static void swap(int a , int b , char [] ch) {
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
    }
}
