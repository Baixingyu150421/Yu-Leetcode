import java.util.Arrays;

public class findContentChildren_0455 {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        int contentChildren = findContentChildren(g, s);
        System.out.println(contentChildren);
    }
    //把尽量小的饼干分给可满足的孩子
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        int cookie = 0;
        while (child != g.length && cookie != s.length){
               if(g[child] <= s[cookie]){
                   child++;
                   cookie++;
               }else {
                   cookie++;
               }
        }
        return child;
    }
}
