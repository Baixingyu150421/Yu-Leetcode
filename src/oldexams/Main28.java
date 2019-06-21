package oldexams;


import java.util.Scanner;

public class Main28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                sum += temp;
                arr[i] = temp;
            }
            //求平均值
            int avg = sum / n;
            //无法平分就返回-1
            if (sum % n != 0) {
                System.out.println(-1);
                return;
            }
            int res = 0;
            for (int apple : arr) {
                if (apple > avg) {
                    int over = apple - avg;
                    //每次必须取两个
                    if (over % 2 != 0) {
                        System.out.println(-1);
                        return;
                    } else {
                        //可分几次
                        res += over / 2;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
