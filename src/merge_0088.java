import java.util.Arrays;

public class merge_0088 {
    /**
     * 划水过掉了
     * @param args
     */
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int [] muns2 = {2,5,6};
        merge(nums1,3,muns2,3);
        for (int i :nums1){
            System.out.print(i + ",");
        }
    }

    public  static  void merge(int[] nums1, int m, int[] nums2, int n) {
            for(int i = 0 ; i < n ; i++){
                nums1[m++] = nums2[i];
            }
            Arrays.sort(nums1);
    }
}
