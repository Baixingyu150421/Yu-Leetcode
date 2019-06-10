package oldexams;

public class Main17 {
    public static void main(String[] args) {
        String string1 = Integer.toBinaryString(1999);
        String string2 = Integer.toBinaryString(2299);
        System.out.println(string1);
        System.out.println(string2);
    }
    public int countBitDiff(int m, int n) {
        int c = m^ n;
        int count = 0;
        String string = Integer.toBinaryString(c);
        for(int i = 0 ; i < string.length() ; i++){
            if(string.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}
