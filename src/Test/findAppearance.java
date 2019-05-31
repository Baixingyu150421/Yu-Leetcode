package Test;

public class findAppearance {
    public static void main(String[] args) {
        //"wvillpvpgmpdyeshjwjtbticzsbqbggixayqknazbxvd",44,"bv",2
        String A = "wvillpvpgmpdyeshjwjtbticzsbqbggixayqknazbxvd";
        int lena = 44;
        String  B = "bv";
        int lenb = 2 ;
        int appearance = findAppearance(A, lena, B, lenb);
        System.out.println(appearance);
    }
    //字符串匹配问题 双指针
    public  static int findAppearance(String A, int lena, String B, int lenb) {
        // write code here
        int p1 = 0;
        int p2 = 0;
        while (p1 < lena && p2 < lenb){
          if(A.charAt(p1) == B.charAt(p2)){
              p1++;
              p2++;
          }else {
              if(p2 != 0 && p2 != lenb) p2 = 0;
              p1++;
          }
        }
        if(p1 == lena && p2 != lenb){
            return -1;
        }
        return  p1 - p2 - 1;
    }
}
