package newcode;

public class jiecheng {
    public static void main(String[] args) {
        int n = 1024;
        int sum = 0;
        while(n >= 5)
        {
            sum += n/5;
            n /= 5;
        }
        System.out.println(sum);
    }
}
