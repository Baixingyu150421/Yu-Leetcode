public class superEggDrop_ {
    public static void main(String[] args) {
        int i = superEggDrop(1, 2);
        System.out.println(i);
    }
    //未解决
    public static int superEggDrop(int K, int N) {
        int res = 2;
        int i = 1;
        for( ; i < N ; i++){
            res*=2;
            if(res > N ){
                break;
            }
        }
        return i + 1;
    }
}
