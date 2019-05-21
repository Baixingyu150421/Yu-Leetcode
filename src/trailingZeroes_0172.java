public class trailingZeroes_0172 {
    public static void main(String[] args) {
        int i = trailingZeroes(10);
        System.out.println(i);
    }
    public static int trailingZeroes(int n) {
        return n < 5 ? 0 : n/5 + trailingZeroes(n / 5);
    }
}
