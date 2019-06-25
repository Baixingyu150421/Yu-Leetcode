public class Main34 {
    public static void main(String[] args) {
        String sbc = "dsafs";
        for(int i = 0 ; i < sbc.length() ; i++){
            System.out.println(sbc.substring(0,i));
            System.out.println(sbc.substring(i,sbc.length()));
            System.out.println("==========");
        }
    }
}
